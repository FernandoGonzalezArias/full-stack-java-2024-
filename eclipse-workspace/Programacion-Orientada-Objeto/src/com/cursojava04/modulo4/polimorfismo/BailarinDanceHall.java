package com.cursojava04.modulo4.polimorfismo;

public class BailarinDanceHall extends Bailarin {

	public BailarinDanceHall(String nombre, int edad) {
		super(nombre, edad);
	}
	
	@Override
	public void bailar() {
		System.out.println(toString() + " Bailo con Style");

	}
}