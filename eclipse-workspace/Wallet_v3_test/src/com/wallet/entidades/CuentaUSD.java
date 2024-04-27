package com.wallet.entidades;

public class CuentaUSD extends Cuenta {
    
    public CuentaUSD(int numeroCuenta, String titular, double saldo) {
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
            super.retirar(cantidad);
        } else {
            System.out.println("Error: La cantidad a retirar debe ser mayor que cero.");
        }
    }
}
