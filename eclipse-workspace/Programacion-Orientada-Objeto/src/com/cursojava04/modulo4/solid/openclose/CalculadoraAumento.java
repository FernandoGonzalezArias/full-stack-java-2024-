package com.cursojava04.modulo4.solid.openclose;

public class CalculadoraAumento implements CalculadoraInterface {

	@Override
	public double calcularPrecio(double precio) {
		
		return precio*1.1;
	}

}
