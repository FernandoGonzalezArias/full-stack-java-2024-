package com.cursojava04.modulo4.solid.openclose;

public class CalculadoraDescuento implements CalculadoraInterface{

	@Override
	public double calcularPrecio(double precio) {
		
		return precio * 0.9;
	}

}
