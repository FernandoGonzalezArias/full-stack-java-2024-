package com.cursojava04.modulo4.polimorfismo;

public class Bailarin {
	//ATRIBUTOS
	private String nombre;
	private int edad;
	
	//CONSTRUCTOR
	public Bailarin(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	//METODOS
	public void bailar() {
		System.out.println("Bailando");
	}
	
	@Override
	public String toString() {
		return "Yo soy " + nombre + " tengo " + edad + " años ";
	}

	
}
