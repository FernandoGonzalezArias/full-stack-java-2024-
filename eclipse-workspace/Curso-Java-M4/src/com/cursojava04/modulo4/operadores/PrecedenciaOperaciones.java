package com.cursojava04.modulo4.operadores;

public class PrecedenciaOperaciones {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 5;
		int c = 2;
		
		int resultado = a + b * c;
		System.out.println("Resultado de a + b * c: " + resultado);
		
		boolean resultadoLogico = (a > b) && (b < c);
		System.out.println("Resultado de la a > b && b < c = " + resultadoLogico);
		
		boolean resultadoLogico2 = (a > b) || (b < c);
		System.out.println("Resultado de la a > b && b < c = " + resultadoLogico2);

	}

}
