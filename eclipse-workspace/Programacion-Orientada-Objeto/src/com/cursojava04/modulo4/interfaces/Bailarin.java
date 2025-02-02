package com.cursojava04.modulo4.interfaces;

public abstract class Bailarin {
	
	private String nombre;
	private int edad;
	// nombre del bailarin (private )
	// edad del bailarin (private)
	
	//constructor que reciba nombre y edad
	public Bailarin(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	//metodo abstracto de nombre bailar()
	public abstract void bailar();
	
	public void saltar() {
		System.out.println("voy a saltar..");
	}
	
	@Override
	public String toString() {
		return "Yo soy " + nombre + " tengo " + edad + " años y ";
	}
	
}