package com.wallet.entidades.formadepago;

import java.util.Scanner;

public class Moneda extends FormaDePago {
    private String tipoMoneda;

    public Moneda() {
        this.tipoMoneda = "CLP"; // Moneda por defecto
    }

    @Override
    public void realizarPago() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el tipo de moneda (ej. USD, EUR, CLP):");
        tipoMoneda = scanner.nextLine();

        // Lógica para realizar el pago con la moneda especificada
        System.out.println("Pagando en " + tipoMoneda);
    }
}
