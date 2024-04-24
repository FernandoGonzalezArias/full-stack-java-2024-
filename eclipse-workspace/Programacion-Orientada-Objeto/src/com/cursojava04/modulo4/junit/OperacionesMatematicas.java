package com.cursojava04.modulo4.junit;

public class OperacionesMatematicas {
	
	public int sumar(int n1, int n2 ){
		return n1 + n2;
	}
	
	public int restar(int n1, int n2 ){
		return n1 - n2;
	}
	
	public int multiplicar(int n1, int n2 ){
		return n1 * n2;
	}
	
	public int dividir(int n1, int n2 ){
		if (n1 == 0 || n2 ==0) {
			
			throw new ArithmeticException("no se puede dividir por 0");
		}
		return n1 / n2;
		
	}
	
	

}
