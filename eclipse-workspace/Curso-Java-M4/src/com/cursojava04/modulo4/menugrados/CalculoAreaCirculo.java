package com.cursojava04.modulo4.menugrados;

import java.util.Scanner;

public class CalculoAreaCirculo {
    public static void ejecutar(Scanner scanner) {
    	 System.out.println("**********************************************");
        System.out.print("Ingrese el radio del círculo: ");
        double radio = scanner.nextDouble();
        double area = Math.PI * radio * radio;
        System.out.println("El área del círculo es: " + area);
    }
}