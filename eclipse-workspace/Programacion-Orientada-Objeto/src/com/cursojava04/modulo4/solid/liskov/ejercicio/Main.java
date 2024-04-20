package com.cursojava04.modulo4.solid.liskov.ejercicio;

public class Main {

	public static void main(String[] args) {
		CuentaBancariaRetirable ctaBasica = new CuentaBancariaBasica();
		CuentaBancariaRetirable ctaPremiun = new CuentaBancariaPremiun();
		CuentaBancaria ctaLargoPlazo = new CuentaLargoPlazo();
		
		ctaBasica.depositar(1000);
		ctaPremiun.depositar(1000);
		ctaLargoPlazo.depositar(1000);
		
		boolean retiradaBasica = ctaBasica.retirar(500);
		boolean retiradaPremiun =  ctaPremiun.retirar(500);
		
		
		
		System.out.println("Se pudo retirar de la cta basica: " + retiradaBasica);
		System.out.println("Se pudo retirar de la cta premiun: " + retiradaPremiun);
		
	


	}

}
