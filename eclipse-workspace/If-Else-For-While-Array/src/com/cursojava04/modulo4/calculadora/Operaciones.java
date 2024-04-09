package com.cursojava04.modulo4.calculadora;

public class Operaciones {

	public void realizarOperacion(int numero1, int numero2, int opcion) {
		
		//VERIFICAR LA OPCION DEL MENU
		switch(opcion) {
		case 1:
			int resultadoSuma = numero1 + numero2;
			System.out.println("La suma de " + numero1 + "+" + numero2 + " = " + resultadoSuma);
			break;
		case 2:
			int resultadoResta = numero1 - numero2;
			System.out.println("La Resta de " + numero1 + "-" + numero2 + " = " + resultadoResta);
			break;
		case 3:
			int resultadoMultiplicacion = numero1 * numero2;
			System.out.println("La mulpiplicacion de " + numero1 + "*" + numero2 + " = " + resultadoMultiplicacion);
			break;
		case 4:
			int resultadoDivision = numero1 / numero2;
			System.out.println("La division de " + numero1 + "/" + numero2 + " = " + resultadoDivision);
			break;
		}
		
		
		
	}
	
	
}
