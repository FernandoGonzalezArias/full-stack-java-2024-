package com.cursojava04.modulo4.instrumentos;

public class Bateria {
	public String macra;
	public String tipo;
	public int cantidadPlatos;
	public String color;
	public boolean doblePedal;
	
	public void tocarRedoble() {
		System.out.println("tacatacataca");
	}
	
	public void afinar() {
		System.out.println("afinando bateria");
	}
	
	public void montarBateria() {
		System.out.println("Montando bateria");
	}

}
