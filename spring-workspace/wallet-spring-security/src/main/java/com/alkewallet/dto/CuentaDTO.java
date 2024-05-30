package com.alkewallet.dto;


public class CuentaDTO {
	private String nombreCliente;
	private Integer numeroCuenta;
	private Double saldoActual;
	private String verDatos;
	
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
}
