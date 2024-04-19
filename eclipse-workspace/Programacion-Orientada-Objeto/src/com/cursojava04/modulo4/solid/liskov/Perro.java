package com.cursojava04.modulo4.solid.liskov;

public class Perro implements ComportamientoAnimal {

	@Override
	public void comer() {
		System.out.println("El perro come doko en un plato");
		
	}

	@Override
	public void moverse() {
		System.out.println("El perro se mueve moviendo la cola");
	}
	
}
