package com.cursojava04.modulo4.switch1;

import java.util.Scanner;

public class UsandoSwitch {
	/*
	 * CREAREMOS UN PROGRAMA EN JAVA QUE 
	MANEJE LOS PRECIOS DE DISTINTAS FRUTAS
	
	VAMOS A TENER UNA SERIE DE PRECIOS Y
	DEPENDIENDO DE LA FRUTA, VAMOS A MOSTRAR SU PRECIO
	*/

	public static void main(String[] args) {
		
		int precioPlatano = 1200;
		int precioNaranja = 2000;
		int precioPapaya = 4500;
		int precioManzana = 1230;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese la fruta y sabra su precio");
		
		String fruta = scanner.nextLine();
		int precio;
		
		switch(fruta) {
		case "platano":
			precio = precioPlatano;
			break;
		case "naranja":
			precio = precioNaranja;
			break;
		case "papaya":
			precio = precioPapaya;
			break;
		case "manzana":
			precio = precioManzana;
			break;
		default:
			System.out.println("No tenemos esa fruta");
			break;
		}
		
		//if(precio > 0) {
		//	System.out.println("El precio de " + fruta + "es: " + precio);
		//}else {
			//System.out.println("Error de sistema");
		//}
		
		scanner.close();

	}

}
