package com.cursojava04.modulo4.practicasreturn;

public class SaludadorAutomatico {
	
	public String mandarSaludo() {
		SumadorAutomatico sumador = new SumadorAutomatico();
		sumador.sumadorDictador();
		String saludo = "Hola que tal, el numero es: " + sumador.sumadorDictador();
		return saludo;
	}

}
