package com.cursojava04.modulo4.interfaces;

public class BailarinCueca extends Bailarin implements AcrobataInterface{

	public BailarinCueca(String nombre, int edad) {
		super(nombre, edad);
		
	}

	@Override
	public void hacerAcrobacia() {
		System.out.println("Saltando sin red");
	}

	@Override
	public void bailar() {
		System.out.println(super.toString() + "y zapateo saltando");
	}



}
