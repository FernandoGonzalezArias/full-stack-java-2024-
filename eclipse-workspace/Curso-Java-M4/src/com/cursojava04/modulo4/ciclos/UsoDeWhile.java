package com.cursojava04.modulo4.ciclos;

import java.util.Scanner;

public class UsoDeWhile {
	
	public void numerosPares() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Ingrese un numero positivo: ");
		int numero = scanner.nextInt();
		// NUMEROS PARES HASTA EL NUMERO QUE INGRESO LA PERSONA
		// TENER UN CONTADOR
		// CONTADOR = 1
		// MIENTRAS EL CONTADOR SEA MENOR O IGUAL AL NUMERO DE LA PERSONA
		// MOSTRAMOS LOS PARES
		int contador = 1;
		
		while(contador <= numero) {
			if(contador % 2 == 0) {
				System.out.println(contador);
			}
			contador++;
		}
		scanner.close();
		
	}

}
