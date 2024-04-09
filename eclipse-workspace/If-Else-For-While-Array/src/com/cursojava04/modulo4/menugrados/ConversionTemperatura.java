package com.cursojava04.modulo4.menugrados;

import java.util.Scanner;

public class ConversionTemperatura {
    public static void ejecutar(Scanner scanner) {
    	 System.out.println("**********************************************");
        System.out.print("Ingrese la temperatura en grados Celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("La temperatura en grados Fahrenheit es: " + fahrenheit);
    }
}