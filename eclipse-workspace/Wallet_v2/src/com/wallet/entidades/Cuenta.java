package com.wallet.entidades;

import java.util.Scanner;

public class Cuenta {
	
	//ATRIBUTOS
	private int numeroCuenta;
	private String titular;
	private double saldo;
	
	//CONSTRUCTOR POR DEFECTO
	public Cuenta() {
		this.numeroCuenta = 0;
		this.titular = "";
		this.saldo = 0.0;
	}
	
	//CONSTRUCTOR
	public Cuenta(int numeroCuenta, String titular, double saldo) {
		this.numeroCuenta = numeroCuenta;
		this.titular = titular;
		this.saldo = saldo;
	}
	
	//METODOS
	public void mostrarInformacion() {
		System.out.println("Numero de cuenta: " + numeroCuenta);
		System.out.println("Titular: " + titular);
		System.out.println("Saldo: " + saldo);
	}
	
	public static Cuenta crearCuentaDesdeTeclado() {
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Ingrese el numero de la cuenta: ");
		int numeroCuenta = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Ingrese el nombre del titular: ");
		String titular = scanner.nextLine();
		
		System.out.println("Ingrese saldo: ");
		double saldo = scanner.nextDouble();
		scanner.close();
		
		return new Cuenta(numeroCuenta, titular, saldo);
	}
	 //OTRA OPCION PARA CREAR CUENTA DESDE TECLADO
	public Cuenta crearCuentaDesdeTecladoV2() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese el numero de la cuenta: ");
		int numeroCuenta = scanner.nextInt();
		
		System.out.println("Ingrese el nombre del titular: ");
		String titular = scanner.nextLine();
		
		System.out.println("Ingrese saldo: ");
		double saldo = scanner.nextDouble();
		scanner.close();
		
		Cuenta cuenta = new Cuenta(numeroCuenta, titular, saldo);
		return cuenta;
	}
	
	//GETTERS AND SETTERS
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
