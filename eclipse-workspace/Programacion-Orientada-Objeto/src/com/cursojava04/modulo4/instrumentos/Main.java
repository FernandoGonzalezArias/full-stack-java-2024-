package com.cursojava04.modulo4.instrumentos;

public class Main {

	public static void main(String[] args) {
		//FENDER - YAMAHA - GIBSON
		Guitarra guitarra1 = new Guitarra();
		Guitarra guitarra2 = new Guitarra();
		Guitarra guitarra3 = new Guitarra();
		
		
		guitarra1.tipo = "Electrica";
		guitarra1.marca = "Fender";
		guitarra1.cantidadCuerdas = 6;
		guitarra1.color = "Black";
		
		//CONSTRUIMOS EL RESTO
		guitarra1.emitirNotaMarca(guitarra1);
		
		

	}

}
