package com.cursojava04.modulo4.constructores;

public class CuentaBancaria {
	
	//ESTRUCTURA DE CLASE CON SUS ATRIBUTOS
	public int numeroDeCuenta;
	public double saldoActual;
	public String titular;
	
	//CONSTRUCTOR EXPLICITO, LOS VALOS SE INGRESAN EN EL CONSTRUCTOR
	public CuentaBancaria(String titularQueVienedesdeMain, int numeroDeCuentaQUeVieneDeMain) {
		this.titular = titularQueVienedesdeMain;
		this.numeroDeCuenta = numeroDeCuentaQUeVieneDeMain;
	}
	
	//CONSTROCTOR POR DEFECTO LOS VALORES SE INGRESAN EN EL MAIN 
    public CuentaBancaria() {
		
	}
	
	// Y CON SUS METODOS
	public void generarSaludoApertura() {
		System.out.println("Bienvenido a su cuenta");
	}

}
