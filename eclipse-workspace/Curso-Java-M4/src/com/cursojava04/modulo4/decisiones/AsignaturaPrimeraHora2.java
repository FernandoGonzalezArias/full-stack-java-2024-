package com.cursojava04.modulo4.decisiones;

import java.util.Scanner;

public class AsignaturaPrimeraHora2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese un dia de la semana: ");
		
		String diaSemana = scan.nextLine();
		
		
		
		if(diaSemana.equals("lunes")) {
			System.out.println("algebra");
		}else if(diaSemana.equals("martes")) {
			System.out.println("matematicas");
		}else if(diaSemana.equals("miercoles")) {
			System.out.println("historia");
		}else if(diaSemana.equals("jueves")) {
			System.out.println("biologia");
		}else if(diaSemana.equals("viernes")) {
			System.out.println("fisica");
		}else {
			System.out.println("Ingrese un dia de semana valido");
		}

	}

}
