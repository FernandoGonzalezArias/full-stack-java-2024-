package com.wallet.ejecucion;

import com.wallet.entidades.Cuenta;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("---------Cuenta por teclado------------");
		//CREAR CUENTA POR TECLADO
		Cuenta billetera1 = new Cuenta();
		billetera1 = Cuenta.crearCuentaDesdeTeclado();
		billetera1.mostrarInformacion();
		
		System.out.println("-----------Contructor vacio----------------");
		//CREAR CUENTA POR CONSTRUCTOR POR DEFECTO O VACIO
		Cuenta billetera2 = new Cuenta();
		billetera2.mostrarInformacion();
		
		System.out.println("-----------Contructor explicito----------------");
		//CREACION CON CONSTRUCTOR EXPLICITO
		Cuenta billetera3 = new Cuenta(30, "Eduardo", 1000);
		billetera3.mostrarInformacion();

	}

}
