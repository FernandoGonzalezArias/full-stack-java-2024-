package com.cursojava04.modulo4.menugrados;

import java.util.Scanner;

public class DescuentoCompra {
    public static void ejecutar(Scanner scanner) {
    	 System.out.println("**********************************************");
        System.out.print("Ingrese el precio original del producto: ");
        double precioOriginal = scanner.nextDouble();
        double descuento = precioOriginal * 0.15;
        double precioFinal = precioOriginal - descuento;
        System.out.println("El precio final con el descuento aplicado es: " + precioFinal);
    }
}
