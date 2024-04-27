package com.wallet.entidades;

public class CuentaPesoCL extends Cuenta {
    private static final double CAMBIO_DOLAR_PESO_CL = 800; // Ejemplo: 1 dólar = 800 pesos chilenos

    public CuentaPesoCL(int numeroCuenta, String titular, double saldo) {
        super(numeroCuenta, titular, saldo);
    }

    @Override
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            super.depositar(cantidad);
        } else {
            System.out.println("Error: La cantidad a depositar debe ser mayor que cero.");
        }
    }

    @Override
    public void retirar(double cantidad) {
        if (cantidad > 0) {
           
            if (getSaldo() >= cantidad) {
                super.retirar(cantidad);
            } else {
                System.out.println("Error: Saldo insuficiente para retirar $" + cantidad + " pesos.");
            }
        } else {
            System.out.println("Error: La cantidad a retirar debe ser mayor que cero.");
        }
    }
}
