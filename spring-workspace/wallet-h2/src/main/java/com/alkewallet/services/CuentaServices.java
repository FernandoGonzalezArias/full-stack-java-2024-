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
	
	@PostConstruct
	public void init() {
		Cliente cliente = new Cliente();
		
		Cuenta cuenta = new Cuenta();
		
		cuenta.setNombreCliente("Rick");
		cuenta.setSaldoActual(100.0);
		
		cliente.setNombre("Rick Titular");
		clienteRepository.save(cliente);
		cliente.setCuenta(cuenta);
		cuentaRepository.save(cuenta);
		
		
	}
	
	public CuentaDTO getCuenta() {
		Cuenta cuenta = cuentaRepository.findById(123456).orElseThrow(
			()-> new RuntimeException("Cuenta no encontrada")	
		);
		return convertToDTO(cuenta);
	}
	
	public Cuenta depositar(Double montoDeposito) {
		Cuenta cuenta = cuentaRepository.findById(123456).orElseThrow(
				()-> new RuntimeException("Cuenta no encontrada")	
			);
		Double saldoActual = cuenta.getSaldoActual();
		cuenta.setSaldoActual(saldoActual + montoDeposito);
		cuentaRepository.save(cuenta);
		return cuenta;
	}
	
	
	public Cuenta retirar(Double montoRetiro) {
		Cuenta cuenta = cuentaRepository.findById(123456).orElseThrow(
				()-> new RuntimeException("Cuenta no encontrada")	
			);
		Double saldoActual = cuenta.getSaldoActual();
		cuenta.setSaldoActual(saldoActual - montoRetiro);
		cuentaRepository.save(cuenta);
		return cuenta;
	}
	
	private CuentaDTO convertToDTO(Cuenta cuenta) {
		CuentaDTO dto = new CuentaDTO();
		dto.setNombreCliente(cuenta.getNombreCliente());
		dto.setNumeroCuenta(cuenta.getNumeroCuenta());
		dto.setSaldoActual(cuenta.getSaldoActual());
		return dto;
	}
}
