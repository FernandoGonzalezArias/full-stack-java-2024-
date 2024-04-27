package com.wallet.entidades;

import java.util.Scanner;

public class Cuenta {
	private int numeroCuenta;
	private String titular;
	private double saldo;
	
	public Cuenta() {
		this.numeroCuenta = 0;
		this.titular="";
		this.saldo = 0.0;
	}
	
	public Cuenta(int numeroCuenta, String titular, double saldo) {
		this.numeroCuenta = numeroCuenta;
		this.titular = titular;
		this.saldo = saldo;
	}
	
	public static Cuenta crearCuentaDesdeTeclado() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el numero de cuenta:");
		int numeroCuenta = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Ingrese el nombre del titular:");
		String titular = scanner.nextLine();
		System.out.println("Ingrese el saldo:");
		double saldo = scanner.nextDouble();
		scanner.close();
		return new Cuenta(numeroCuenta, titular, saldo);
	}  
	
	public void depositar(double cantidad){
		if(cantidad > 0) {
			saldo += cantidad;
			System.out.println("Se ha ingresado " + cantidad + " en la cuenta");
		}else {
			System.out.println("Favor ingrese una cantidad para depositar");
		}
	}
	
	
    public void retirar(double cantidad) {
        if (cantidad > 0 && saldo >= cantidad) {
            saldo -= cantidad;
            System.out.println("Se ha retirado $" + cantidad + " de la cuenta.");
        } else {
            System.out.println("Error: Saldo insuficiente o cantidad no válida para retirar.");
        }
    }
    
  //metodo para mostrar info de la cuenta
  	public void mostrarInformacion(){
  		System.out.println("Numero de cuenta:  " + numeroCuenta);
  		System.out.println("Titular : " + titular);
  		System.out.println("Saldo: " + saldo);
  	}
		
	
	//puros getters y setters
	public int getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	
}
