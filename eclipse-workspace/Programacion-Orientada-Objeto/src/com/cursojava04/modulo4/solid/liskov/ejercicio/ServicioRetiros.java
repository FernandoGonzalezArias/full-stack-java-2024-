package com.cursojava04.modulo4.solid.liskov.ejercicio;

import java.util.ArrayList;
import java.util.List;

public class ServicioRetiros {
	
	public static final double MONTO_GASTO_ADMIN = 25.00;
	
	public void cargarDebitarCuentas() {
		
		CuentaBancaria ctaBasica = new CuentaBancariaBasica();
		ctaBasica.depositar(100.00);
		
		CuentaBancaria ctaPremiun = new CuentaBancariaPremiun();
		ctaPremiun.depositar(200.00);
		
		List<CuentaBancaria> cuentas = new ArrayList<CuentaBancaria>();
		cuentas.add(ctaBasica);
		cuentas.add(ctaPremiun);
		
		debitarGastoAdmin(cuentas);
	}

	private void debitarGastoAdmin(List<CuentaBancaria> cuentas) {
		
		for (CuentaBancaria cuentaBancaria : cuentas) {
			cuentaBancaria.retirar(MONTO_GASTO_ADMIN);
		}
		
	}

}
