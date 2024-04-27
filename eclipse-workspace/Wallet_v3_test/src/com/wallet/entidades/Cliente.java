package com.wallet.entidades;

public class Cliente {
	
	private long id;
	private String nombre;
	private Cuenta cuenta; // asociacion con la clase Cuenta
	
	public Cliente(long id, String nombre, Cuenta cuenta) {
		this.id = id;
		this.nombre = nombre;
		this.cuenta = cuenta;
	}
	
	public void mostrarInformacion(){
		System.out.println("Id cliente :  " + id);
		System.out.println("Nombre cliente : " + nombre);
		System.out.println("Datos de la cuenta : ");
		cuenta.mostrarInformacion();
	}
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Cuenta getCuenta() {
		return cuenta;
	}

	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}
	
	
	
	
	
}
