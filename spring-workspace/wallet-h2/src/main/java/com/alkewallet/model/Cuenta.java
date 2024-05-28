package com.alkewallet.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Cuenta {
	
	@Id
	private Integer numeroCuenta;
	private String nombreCliente;
	private Double saldoActual;
	private String verDatos;
	
	public Cuenta(String nombreCliente, Integer numeroCuenta, Double saldoActual, String verDatos) {
		super();
		this.nombreCliente = nombreCliente;
		this.numeroCuenta = numeroCuenta;
		this.saldoActual = saldoActual;
		this.verDatos = verDatos;
	}

	public Cuenta() {
		super();
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public Integer getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(Integer numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public Double getSaldoActual() {
		return saldoActual;
	}

	public void setSaldoActual(Double saldoActual) {
		this.saldoActual = saldoActual;
	}

	public String getVerDatos() {
		return verDatos;
	}

	public void setVerDatos(String verDatos) {
		this.verDatos = verDatos;
	}

	@Override
	public String toString() {
		return "Cuenta [nombreCliente=" + nombreCliente + ", numeroCuenta=" + numeroCuenta + ", saldoActual="
				+ saldoActual + ", verDatos=" + verDatos + "]";
	}
	
	

}
