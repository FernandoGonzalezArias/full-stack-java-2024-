package com.cursojava04.modulo4.constructores;

public class Main {

	public static void main(String[] args) {
		//CONSTRUCTOR EXPLICITO SE AGREGAN VALORES EN EL MISMO CONSTRUCTOR
		CuentaBancaria cuenta = new CuentaBancaria("Fernando", 123);
		
		//CONSTRUCTOR POR DEFECTO SE AGREGAN VALORES INSTANCIANDO
		CuentaBancaria cuenta2 = new CuentaBancaria();
		// INGRESAMOS LOS VALORES A LOS ATRIBUTOS 
		cuenta2.saldoActual = 123.321;
		cuenta2.numeroDeCuenta = 123;
		cuenta2.titular = "Fernando";
		
		//LLAMAMOS O INSTANCIAMOS EL OBJETO
		cuenta.generarSaludoApertura();
		

	}

}
