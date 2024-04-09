package com.cursojava04.modulo4.calculadora;

import java.util.Scanner;

public class Menu {

	public void generarMenu() {
		
		Operaciones operaciones = new Operaciones();
		
		System.out.println("***** CALCULADORA ***** ");
		System.out.println("***** INGRESO DE VALORES ***** ");
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingrese el primer numero: ");
		int numero1 = scanner.nextInt();
		System.out.print("Ingrese el segundo numero: ");
		int numero2 = scanner.nextInt();
		
		//MOSTRAR LAS DISTINTAS OPCIONES
		System.out.println("***** MENU DE OPCIONES ***** ");
		System.out.println("1. Sumar");
		System.out.println("2. Restar");
		System.out.println("3. Multiplicar");
		System.out.println("4. Dividir");
		
		
		// PEDIR AL USUARIO QUE SELECCIONE UNA OPCION
		System.out.print("Seleccione una opcion: ");
		int opcion = scanner.nextInt();
		
		System.out.println("Ingreso la opcion " + opcion);
		operaciones.realizarOperacion(numero1, numero2, opcion);
		
	}
	
	
	
	
	
	
	
}
