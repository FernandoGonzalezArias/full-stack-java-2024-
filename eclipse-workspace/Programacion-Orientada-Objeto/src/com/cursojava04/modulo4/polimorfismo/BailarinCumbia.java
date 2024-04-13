package com.cursojava04.modulo4.polimorfismo;

public class BailarinCumbia extends Bailarin {

	public BailarinCumbia(String nombreBailarin, int edadBailarin) {
		super(nombreBailarin, edadBailarin);
		
	}
	
	@Override
	public void bailar() {
		System.out.println(toString()  + "Bailo Cumbia Colombiana");
		
	}


}
