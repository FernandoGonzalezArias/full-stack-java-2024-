package com.alkewallet.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Cuenta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer numeroCuenta;
	private String nombreCliente;
	private Double saldoActual;
	private String verDatos;
	
	@OneToOne(mappedBy = "cuenta", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Cliente cliente;
	
	
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

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "Cuenta [nombreCliente=" + nombreCliente + ", numeroCuenta=" + numeroCuenta + ", saldoActual="
				+ saldoActual + ", verDatos=" + verDatos + "]";
	}
	
}
