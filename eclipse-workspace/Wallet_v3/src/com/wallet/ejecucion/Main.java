package com.wallet.ejecucion;

import com.wallet.entidades.Cliente;
import com.wallet.entidades.Cuenta;

public class Main {

	public static void main(String[] args) {
		
		//CREAR UN CLIENTE CON UNA CUENTA EXISTENTE
		Cuenta billetera1 = new Cuenta(123245, "Juan", 100);
		Cliente cliente1 = new Cliente(1, "Max", billetera1);
		
		//MOSTRAR INFORMACION DEL CLIENTE Y SU CUENTA
		cliente1.mostrarInformacion();

	}

}
