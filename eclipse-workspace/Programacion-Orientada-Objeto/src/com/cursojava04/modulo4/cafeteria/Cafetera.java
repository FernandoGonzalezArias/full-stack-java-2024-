package com.cursojava04.modulo4.cafeteria;

public class Cafetera {
	//ATRIBUTOS
	private int capacidadMaxima;
	private int cantidadActual;
	
	//CONSTRUCTOR DEFINITO POR NOSOTROS
	public Cafetera(int capacidadMaxima, int cantidadActual) {
		this.capacidadMaxima = capacidadMaxima;
		this.cantidadActual = cantidadActual;
	}
	
	//CONSTRUCTOR VACIO
	public Cafetera() {
		
	}

	//GETTER Y SETTER
	public int getCapacidadMaxima() {
		return capacidadMaxima;
	}

	public void setCapacidadMaxima(int capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
	}

	public int getCantidadActual() {
		return cantidadActual;
	}

	public void setCantidadActual(int cantidadActual) {
		this.cantidadActual = cantidadActual;
	}
	
	//METODOS
	public void llenarCafetera() {
		
	}
	
	public void servirTaza(int tamanoTaza) {
		
	}
	
    public void vaciarCafetera() {
		
	}
    
    public void agregarCafe(int cantidadCafe) {
		
	}
	
	

}
