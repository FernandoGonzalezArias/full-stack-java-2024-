package com.cursojava04.modulo4.solid.liskov.ejercicio;

public class CuentaLargoPlazo extends CuentaBancariaRetirable {
	
	private double saldo;

	@Override
	public void depositar(double monto) {
		this.setSaldo(this.getSaldo() + monto);

	}

	@Override
	public boolean retirar(double monto) {
		return false;
		
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
