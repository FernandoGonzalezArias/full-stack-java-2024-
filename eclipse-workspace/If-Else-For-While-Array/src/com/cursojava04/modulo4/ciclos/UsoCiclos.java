package com.cursojava04.modulo4.ciclos;

public class UsoCiclos {

	public static void main(String[] args) {
		CicloRepetitivo ciclorepetitivo = new CicloRepetitivo();
		UsoDeWhile mientras = new UsoDeWhile();
		ciclorepetitivo.generaVueltas();
		
		// SI HAY MAS DE 1 OBJ QUE OCUPE SCANNER DA ERROR EN CONSOLA
		//ciclorepetitivo.generaVueltasporUsuario(); //ESTE OCUPA SCANNER
		
		mientras.numerosPares(); //ESTE OCUPA SCANNER

	}

}
