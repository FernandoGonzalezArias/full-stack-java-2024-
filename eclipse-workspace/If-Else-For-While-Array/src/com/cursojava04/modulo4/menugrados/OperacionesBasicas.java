package com.cursojava04.modulo4.menugrados;

import java.util.Scanner;

public class OperacionesBasicas {
    public static void ejecutar(Scanner scanner) {
    	 System.out.println("**********************************************");
        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();

        System.out.println("Suma: " + (num1 + num2));
        System.out.println("Resta: " + (num1 - num2));
        System.out.println("Multiplicación: " + (num1 * num2));

        if (num2 != 0) {
            System.out.println("División: " + ((double) num1 / num2));
        } else {
            System.out.println("No se puede dividir por cero.");
        }
    }
}
