package com.cursojava04.modulo4.tablamultiplicar;

import java.util.Scanner;

public class TablaMultiplicar {

    public  void tablas() {
        Scanner scanner = new Scanner(System.in);

        // PEDIMOS AL USUARIO QUE INGRESE UN NUMERO
        System.out.print("Ingresa un número: ");
        int numero = scanner.nextInt();

        // CICLO DE 1 A 10
        for (int i = 1; i <= 10; i++) {
            // MULTIPLICAMOS EL NUMERO INGRESADO POR EL CONTADOR
            int resultado = numero * i;
            // MOSTRAMOS EL RESULTADO
            System.out.println("Número " + numero + " * " + i + " = " + resultado);
        }

        scanner.close();
    }
	
	
	
}
 