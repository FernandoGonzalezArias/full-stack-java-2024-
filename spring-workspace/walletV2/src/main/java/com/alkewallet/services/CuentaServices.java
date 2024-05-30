package com.alkewallet.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.alkewallet.dto.CuentaDTO;
import com.alkewallet.model.Cliente;
import com.alkewallet.model.Cuenta;
import com.alkewallet.repository.ClienteRepository;
import com.alkewallet.repository.CuentaRepository;

import jakarta.annotation.PostConstruct;

@Service
public class CuentaServices {
	
	
	@Autowired
	private CuentaRepository cuentaRepository;
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	private static Integer cuentaFalsaPrueba = 1;
	
	//creamos una cuenta en BD al iniciar la aplicacion
	@PostConstruct
	public void init() {
		Cliente cliente = new Cliente();
		Cuenta cuenta = new Cuenta();
		cuenta.setNombreCliente("Rick Hunter");
		cuenta.setSaldoActual(1000.0);		
		
		cliente.setNombre("Rick Hunter Titular");
		clienteRepository.save(cliente);
		cliente.setCuenta(cuenta);
		cuentaRepository.save(cuenta);
		
	}
	
	//usando jpa repository para ir a buscar una cuenta a la BD
	public CuentaDTO getCuenta() {
		
		Cuenta cuenta = cuentaRepository.findById(cuentaFalsaPrueba).orElseThrow(
			()-> new RuntimeException("Cuenta no encontrada")	
		);
		return convertToDTO(cuenta);
	}
	
	
	//vamos a depositar una cuenta
	public CuentaDTO depositar(Double montoDeposito) {
		Cuenta cuenta = cuentaRepository.findById(cuentaFalsaPrueba).orElseThrow(
				()-> new RuntimeException("Cuenta no encontrada")	
			);
		Double saldoActual = cuenta.getSaldoActual();
		cuenta.setSaldoActual(saldoActual +  montoDeposito);
		cuentaRepository.save(cuenta); //---> este metodo de repositorio hace el insert
		return convertToDTO(cuenta);
		
	}
	
	public CuentaDTO retirar(Double montoRetiro) {
		Cuenta cuenta = cuentaRepository.findById(cuentaFalsaPrueba).orElseThrow(
				()-> new RuntimeException("Cuenta no encontrada")	
			);
		Double saldoActual = cuenta.getSaldoActual();
		cuenta.setSaldoActual(saldoActual -  montoRetiro);
		cuentaRepository.save(cuenta); //---> este metodo de repositorio hace el insert
		return convertToDTO(cuenta);
	}
	
	private CuentaDTO convertToDTO(Cuenta cuenta) {
		CuentaDTO dto = new CuentaDTO();
		dto.setNombreCliente(cuenta.getNombreCliente());
		dto.setNumeroCuenta(cuenta.getNumeroCuenta());
		dto.setSaldoActual(cuenta.getSaldoActual());
		return dto;
	}
}
