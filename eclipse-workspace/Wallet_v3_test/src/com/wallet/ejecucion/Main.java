package com.wallet.ejecucion;

import com.wallet.entidades.Cliente;

import com.wallet.entidades.Cuenta;
import com.wallet.entidades.CuentaPesoCL;
import com.wallet.entidades.CuentaUSD;
import com.wallet.entidades.billeteras.Billetera;
import com.wallet.entidades.formadepago.*;

public class Main {

	public static void main(String[] args) {
        // Crear una cuenta en pesos chilenos
		System.out.println("==================CUENTA EN PESOS==========================");
        CuentaPesoCL cuentaPeso = new CuentaPesoCL(123456, "Juan Perez", 1000);

        // Mostrar información de la cuenta en pesos
        System.out.println("Información de la Cuenta en Pesos Chilenos:");
        cuentaPeso.mostrarInformacion();

        // Realizar operaciones en la cuenta en pesos
        System.out.println("\nRealizar operaciones en la Cuenta en Pesos Chilenos:");
        cuentaPeso.depositar(1000); // Depositar en pesos
        cuentaPeso.retirar(500.0); // Retirar en pesos

        // Mostrar información actualizada de la cuenta en pesos
        System.out.println("\nInformación actualizada de la Cuenta en Pesos Chilenos:");
        cuentaPeso.mostrarInformacion();

        
        System.out.println("==================CUENTA EN DOLARES==========================");
        CuentaUSD cuentaDolar = new CuentaUSD(789012, "Maria Lopez", 1000.0);

        // Mostrar información de la cuenta en dólares
        System.out.println("\nInformación de la Cuenta en Dólares:");
        cuentaDolar.mostrarInformacion();
        
        System.out.println("\nRealizar operaciones en la Cuenta en Dólares:");
        cuentaDolar.depositar(1000); // Depositar en dólares
        cuentaDolar.retirar(100); // Retirar en dólares
        System.out.println("\nInformación de la Cuenta en Dólares:");
        cuentaDolar.mostrarInformacion();
        
        
        System.out.println("==================CREAR BILLETERA==========================");
        Billetera billetera = new Billetera();

        // Prueba con TarjetaDeCredito
        System.out.println("Realizar pago con Tarjeta de Crédito:");
        FormaDePago tarjetaCredito = new TarjetaDeCredito();
        billetera.asignarMetodoPago(tarjetaCredito);
        billetera.realizarPago();

        // Prueba con Moneda
        System.out.println("\nRealizar pago con Moneda:");
        FormaDePago moneda = new Moneda();
        billetera.asignarMetodoPago(moneda);
        billetera.realizarPago();
    }

}
