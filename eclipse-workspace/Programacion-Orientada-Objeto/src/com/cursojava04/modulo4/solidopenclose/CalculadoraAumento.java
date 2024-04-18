package com.cursojava04.modulo4.solidopenclose;

public class CalculadoraAumento implements CalculadoraInterface {

	@Override
	public double calcularPrecio(double precio) {
		
		return precio*1.1;
	}

}
