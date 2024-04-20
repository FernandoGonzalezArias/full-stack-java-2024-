package com.cursojava04.modulo4.solid.liskov.ejercicio;

public class CuentaBancariaPremiun extends CuentaBancariaRetirable {
	
	private double saldo;
	private int puntosPrefiero;

	@Override
	public void depositar(double monto) {
		this.saldo += monto;
		incrementarPuntosPrefiero();

	}

	@Override
	public boolean retirar(double monto) {
		if(this.saldo >= 0 && this.saldo > monto) {
			this.saldo -= monto;
			incrementarPuntosPrefiero();
			return true;
		}else {
			return false;
		}
		
	}
	
	private void incrementarPuntosPrefiero() {
		this.setPuntosPrefiero(this.getPuntosPrefiero() + 1) ;
	}

	public int getPuntosPrefiero() {
		return puntosPrefiero;
	}

	public void setPuntosPrefiero(int puntosPrefiero) {
		this.puntosPrefiero = puntosPrefiero;
	}

}
