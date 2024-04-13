package com.cursojava04.modulo4.polimorfismo;

public class BailarinUrbano extends Bailarin {

	public BailarinUrbano(String nombre, int edad) {
		super(nombre, edad);
		
	}
	
	@Override 
	public void bailar() {
		System.out.println(toString() + "bailo con el terrible flow");
	}

}
