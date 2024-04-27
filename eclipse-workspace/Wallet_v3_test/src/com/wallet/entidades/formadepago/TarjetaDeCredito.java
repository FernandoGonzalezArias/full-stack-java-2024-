package com.wallet.entidades.formadepago;

import java.util.Scanner;

public class TarjetaDeCredito extends FormaDePago {
    private int cuotas;

    public TarjetaDeCredito() {
        this.cuotas = 1; // Cuotas por defecto
    }

    @Override
    public void realizarPago() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de cuotas:");
        cuotas = scanner.nextInt();

        // Lógica para realizar el pago con tarjeta de crédito
        System.out.println("Pagando con tarjeta de crédito en " + cuotas + " cuotas.");
    }
}
