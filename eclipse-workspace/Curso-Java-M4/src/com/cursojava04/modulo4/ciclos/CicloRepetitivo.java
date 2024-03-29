package com.cursojava04.modulo4.ciclos;

import java.util.Scanner;

/**
 *  CLASE DE PRUEBA PARA CONOCER EL CICLO "FOR"
 */
public class CicloRepetitivo {
	
	// 1- DESDE DONDE INICIA EL CICLO
	// 2- HASTA DONDE CORRERA EL CICLO
	// 3- COMO AUMENTO MI CONTADOR
	public void generaVueltas() {
		
	for(int i = 1; i <= 10; i++ ) {
		System.out.println("Vuelta: " + i);
		}
	}
	
	public void generaVueltasporUsuario() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Cuentas vueltas quieres?");
		int vueltas = scanner.nextInt();
		
		for(int i = 1; i <= vueltas; i++) {
			System.out.println("Vuelta numero: " + i);
			}
		
		System.out.println("Me canse");
		scanner.close();
	}

}
