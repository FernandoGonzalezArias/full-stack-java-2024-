package com.cursojava04.modulo4.interfaces;

public class BailarinCumbia extends Bailarin implements CantarInterface {

	public BailarinCumbia(String nombre, int edad) {
		super(nombre, edad);
		
	}

	@Override
	public void cantar() {
		System.out.println(super.toString() + " se cantar normal");
	
	}

	@Override
	public void falcete() {
		System.out.println(super.toString() + " haciendo falcete");
	}

	@Override
	public void gutural() {
		System.out.println(super.toString() + "haciendo gutural");
	}

	@Override
	public void bailar() {
		System.out.println(super.toString() + " y bailo la cumbia");
		
	}

}
