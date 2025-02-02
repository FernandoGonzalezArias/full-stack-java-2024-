package com.cursojava04.modulo4.arreglosmultidimensional;

public class Multidimension {
	
	public static void main(String[] args) {
		Multidimension multi = new Multidimension();
		multi.generaArreglo();
		multi.matrizDeSeisxSeis();
		multi.matrizDeSeisxSeis2();
	}
	
	public void generaArreglo() {
		//DECLARACION -- FILA PRIMERO DESPUES COLUMNA
		System.out.println("----------MATRIZ 2X2-------------");
		
			int[][] matriz = new int [2][2];
			matriz[0][0]=2;
			matriz[0][1]=90;
			
			matriz[1][0]=18;
			matriz[1][1]=13;
			
			for(int i = 0; i < matriz.length ; i++) {
				for(int j = 0; j < matriz[i].length; j++) {
					System.out.print(matriz[i][j] + " ");
				}
				System.out.println();
			}
			
	}
	
	public void matrizDeSeisxSeis() {
		System.out.println("----------MATRIZ 6X6-------------");
		
	    int[][] matriz = new int[6][6];
	    
	    matriz[0][0] = 2;
	    matriz[0][1] = 90;
	    matriz[0][2] = 5;
	    matriz[0][3] = 13;
	    matriz[0][4] = 6;
	    matriz[0][5] = 22;
	    
	    matriz[1][0] = 18;
	    matriz[1][1] = 13;
	    matriz[1][2] = 7;
	    matriz[1][3] = 45;
	    matriz[1][4] = 10;
	    matriz[1][5] = 3;
	    
	    matriz[2][0] = 8;
	    matriz[2][1] = 19;
	    matriz[2][2] = 27;
	    matriz[2][3] = 11;
	    matriz[2][4] = 14;
	    matriz[2][5] = 17;
	    
	    matriz[3][0] = 25;
	    matriz[3][1] = 2;
	    matriz[3][2] = 33;
	    matriz[3][3] = 1;
	    matriz[3][4] = 8;
	    matriz[3][5] = 4;
	    
	    matriz[4][0] = 6;
	    matriz[4][1] = 9;
	    matriz[4][2] = 15;
	    matriz[4][3] = 28;
	    matriz[4][4] = 12;
	    matriz[4][5] = 20;
	    
	    matriz[5][0] = 16;
	    matriz[5][1] = 21;
	    matriz[5][2] = 23;
	    matriz[5][3] = 35;
	    matriz[5][4] = 29;
	    matriz[5][5] = 42;
	    
	    // IMPRIMIR LA MATRIZ
	    for(int i = 0; i < matriz.length; i++) {
	        for(int j = 0; j < matriz[i].length; j++) {
	            System.out.print(matriz[i][j] + " ");
	        }
	        System.out.println();
	    }
	}
	
	public void matrizDeSeisxSeis2(){
		System.out.println("----------MATRIZ 6X6 FORMA 2-------------");
		
	    int[][] matriz = new int[][] {
	        {1, 2, 3, 4, 5, 6},
	        {7, 8, 9, 10, 11, 12},
	        {13, 14, 15, 16, 17, 18},
	        {19, 20, 21, 22, 23, 24},
	        {25, 26, 27, 28, 29, 30},
	        {31, 32, 33, 34, 35, 36}
	    };

	    // IMPRIMIR LA MATRIZ
	    for(int i = 0; i < matriz.length; i++) {
	        for(int j = 0; j < matriz[i].length; j++) {
	            System.out.print(matriz[i][j] + " ");
	        }
	        System.out.println();
	    }
	}



}
