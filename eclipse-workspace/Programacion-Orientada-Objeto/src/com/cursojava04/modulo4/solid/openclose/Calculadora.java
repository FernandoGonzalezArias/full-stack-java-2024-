package com.cursojava04.modulo4.solid.openclose;

public class Calculadora {
	//VAMOS A TENER UNA LOGICA 
	// QUE CALCULE PRECIOS CON 
	//10 PORCIENTO DE RECARGO
	
	// Y LUEGO NOS MANDA A QUE NUESTRO METODO TAMBIEN CALCULE DESCUENTO
	
	public double calcularPrecio(double precio) {
		return precio *1.1; // APLICAMOS RECARGO
		//OPEN/CLOSE
	}

}
