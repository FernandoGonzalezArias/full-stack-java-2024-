package com.cursojava04.modulo4.billetera;

public class Billetera {
	
	//  -------- > COMPORTAMIENTOS < ----------
	// LA BILLETERA PUEDE INGRESAR SALDO
	// LA BILLETERA PUEDE TRANSFERIR SALDO
	// LA BILLETERA PUEDE RETIRAR SALDO
	// LA BILLETERA PUEDE CONSULTAR SALDO
	
	public String saludoDiario() {
		//AQUI SE HACE LA LOGICA
		return "Hola buenos dias";
	}
	
	public int teDevuelvoPlata() {
		return 1000;
	}

	public void ingresarSaldo() {
		//AQUI SE HACE LA LOGICA
		System.out.println("Estamos ingresando saldo ...");
		System.out.println(" Saldo guardado");
	}
	
	
	public void transferirSaldo() {
		//AQUI SE HACE LA LOGICA
		System.out.println("Estamos transfiriendo saldo...");
		System.out.println("Saldo transferido");
	}
	
	public void retirarSaldo() {
		//AQUI SE HACE LA LOGICA
		System.out.println("Estamos retirando saldo...");
		System.out.println("Saldo retirado");
	}
	
	public void consultarSaldo() {
		//AQUI SE HACE LA LOGICA
		System.out.println("Consultando saldo...");
		System.out.println("Saldo consultado");
	}
	
	
	

}
