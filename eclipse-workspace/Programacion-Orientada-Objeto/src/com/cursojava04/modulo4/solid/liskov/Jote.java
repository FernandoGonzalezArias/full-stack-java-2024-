package com.cursojava04.modulo4.solid.liskov;

public class Jote implements ComportamientoAnimal {

	@Override
	public void comer() {
		System.out.println("El jote come carroña");
		
	}

	@Override
	public void moverse() {
		System.out.println("El jote se mueve en el aire");
		
	}
	
}
