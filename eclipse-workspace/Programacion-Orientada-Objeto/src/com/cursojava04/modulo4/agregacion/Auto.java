package com.cursojava04.modulo4.agregacion;

public class Auto {
	private String marca;
	private Motor motor;
	
	public Auto (String marca, Motor motor) {
		this.marca = marca;
		this.motor = motor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	
	

}
