package com.cursojava04.modulo4.decisiones;

public class PracticasIf {

	public static void main(String[] args) {
		
		PracticasIf practicas = new PracticasIf();
		practicas.ifSencillo();
		practicas.metodoIfElse();
		practicas.metodoIfTernario();
    }
	
	/**
	 * @author efern
	 * esto es javadoc
	 */
	public void ifSencillo() {
		int numero = 10;
		if(numero < 100) {
			//LOGICA
			System.out.println("El numero es menor a 100");
		}
	}
	
	public void metodoIfElse() {
		int numero = 7;
		if(numero % 2 == 0) {
			System.out.println("El numero es par");
		}else {
		   System.out.println("El numero no es par");
		}
	}
	
	public void metodoIfTernario() {
		int edad = 20;
		String resultado = (edad >= 18) ? "Es Mayor de edad":"Es menor";
		System.out.println(resultado);
	}
	

}












