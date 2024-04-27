package com.wallet.entidades.billeteras;

import com.wallet.entidades.formadepago.FormaDePago;

public class Billetera {
    private FormaDePago metodoPago;

    public Billetera() {
        this.metodoPago = null;
    }

    public void asignarMetodoPago(FormaDePago metodoPago) {
        this.metodoPago = metodoPago;
    }

    public void realizarPago() {
        if (metodoPago == null) {
            System.out.println("Error: No se ha asignado un método de pago.");
        } else {
            metodoPago.realizarPago();
        }
    }
}
