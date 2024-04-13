package com.cursojava04.modulo4.polimorfismo;

import java.util.Arrays;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		Bailarin bailarinBallet = new BailarinBallet("Thomas", 32);
		Bailarin bailarinCueca = new BailarinCueca("Fernando", 24);
		Bailarin bailarinPerreo = new BailarinPerreo("Felix", 20);
		//CREAMOS UNA LISTA CON TODOS LOS BAILARINES
		List<Bailarin> bailarines = Arrays.asList(bailarinBallet,
				                                 bailarinCueca,
				                                 bailarinPerreo);
		//RECORREMOS TODOS LOS BAILARINES DE LA LISTA
		System.out.println("-------------for each------------");
		for (Bailarin bailarin : bailarines) {
			bailarin.bailar();
		}
		
		System.out.println("-------------uno por uno------------");

		//LLAMAMOS UNO POR UNO
		bailarinBallet.bailar();
		bailarinCueca.bailar();
		bailarinPerreo.bailar();

	}

}
