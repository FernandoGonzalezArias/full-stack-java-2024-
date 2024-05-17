package com.curso04.demo;

public class Empleado {

	private int id;
	private String nombre;
	private String departamento;

	//CONSTUCTOR VACIO
	public Empleado() {

	}

	//CONSTRUCTOR CON DATOS
	public Empleado(int id, String nombre, String departamento) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.departamento = departamento;
	}

	// GETTERS AND SETTERS
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	//SOBREESCRBIR EL TO STRING( CUANDO SE IMPRIMA EL EMPLEADO APARECERA CON SUS ATRIBUTOS)
	@Override
	public String toString() {
		return "Empleado [id=" + id + ", nombre=" + nombre + ", departamento=" + departamento + "]";
	}
	
	

}
