package com.curso04.demo;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Empleado {

	private int id;
	private String nombre;
	private String departamento;
	
	
	
	@Override
	public String toString() {
		return "Empleado [id=" + id + ", nombre=" + nombre + ", departamento=" + departamento + "]";
	}


	

}
