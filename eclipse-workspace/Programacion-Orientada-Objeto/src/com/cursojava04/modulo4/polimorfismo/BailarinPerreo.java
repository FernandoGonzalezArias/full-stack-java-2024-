package com.cursojava04.modulo4.polimorfismo;

public class BailarinPerreo extends Bailarin {

	public BailarinPerreo(String nombre, int edad) {
		super(nombre, edad);
	}
  
	@Override
	public void bailar() {
		System.out.println(toString() + " Bailando con la pistola...");
	}
}