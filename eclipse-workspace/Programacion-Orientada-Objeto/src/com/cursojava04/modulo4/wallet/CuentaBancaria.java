package com.cursojava04.modulo4.wallet;

public class CuentaBancaria {
	//ATRIBUTOS
	private int numeroCuenta;
	private double saldo;
	private String titular;
	
	// CONSTRUCTOR	
	public CuentaBancaria(int numeroCuenta, double saldo, String titular) {
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
		this.titular = titular;
	}
	
	//GETTER Y SETTER
	
	public int getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}
	

	//METODOS
	public void genrarSaludoApertura() {
		System.out.println("Hola");
	}


}
