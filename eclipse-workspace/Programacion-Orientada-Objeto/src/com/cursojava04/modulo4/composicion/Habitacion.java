package com.cursojava04.modulo4.composicion;

public class Habitacion {
	//ATRIBUTOS
	private String tipoRevestimiento;
	private int NumHabitacion;
	
	//CONSTRUCTOR
	public Habitacion(String tipoRevestimiento, int numHabitacion) {
		this.tipoRevestimiento = tipoRevestimiento;
		this.NumHabitacion = numHabitacion;
	}
	
	//GETTERS AND SETTRES
	public String getTipoRevestimiento() {
		return tipoRevestimiento;
	}
	public void setTipoRevestimiento(String tipoRevestimiento) {
		this.tipoRevestimiento = tipoRevestimiento;
	}
	public int getNumHabitacion() {
		return NumHabitacion;
	}
	public void setNumHabitacion(int numHabitacion) {
		NumHabitacion = numHabitacion;
	}
	
	//METODOS
	public void generarInfo() {
		System.out.println("Habitacion generada el año 2024");
	}
	
}
