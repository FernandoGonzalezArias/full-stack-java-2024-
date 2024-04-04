package com.cursojava04.modulo4.arreglos;

public class Ejercicio {
    public static void main(String[] args) {
        // ARREGLO DE EJEMPLO
        int[] arreglo = {49, 10, 500, 5, 100};

        // LLAMADA AL METODO Y MOSTRANDO EL RESULTADO
        System.out.println("El elemento más grande del arreglo es: " + encontrarMaximo(arreglo));
    }
    // METODO PARA ENCONTRAR EL ELEMENTO MAS GRANDE EN UN ARREGLO
    public static int encontrarMaximo(int[] arreglo) {
    	// SUPONEMOS QUE EL PRIMER ELEMENTO ES EL MAXIMO INICIALMENTE
        int maximo = arreglo[0];

        
        // ITERAMOS SOBRE LOS ELEMENTOS DEL ARREGLO PARA ENCONTRAR EL MAXIMO
        for (int elemento : arreglo) {
            if (elemento > maximo) {
            	// SI ENCONTRAMOS UN ELEMENTO MAYOR, LO ASIGNAMOS
            	// COMO EL NUEVO MAXIMO
                maximo = elemento;
            }
        }

        // RETORNAMOS EL MAXIMO ENCONTRADO
        return maximo;
    }
}

