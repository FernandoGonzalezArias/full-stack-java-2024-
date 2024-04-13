package com.cursojava04.modulo4.polimorfismo;

public class BailarinCueca  extends Bailarin {
	
	public BailarinCueca(String nombre, int edad) {
		super(nombre, edad);
	}
	
	@Override
	public void bailar() {
		System.out.println(toString() + " Bailo con Zapateando");

	}
}