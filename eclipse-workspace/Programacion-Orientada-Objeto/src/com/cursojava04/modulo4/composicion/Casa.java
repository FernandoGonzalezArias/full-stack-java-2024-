package com.cursojava04.modulo4.composicion;

import java.util.ArrayList;
import java.util.List;

public class Casa {
	//DIRECCION DE LA CASA
	//LISTA DE HABITACIONES
	
	private String direccion;
	private List<Habitacion> listaHabitaciones;
	
	//CONSTRUCTOR
	public Casa(String direccion) {
		this.direccion = direccion;	
		this.listaHabitaciones = new ArrayList<>();
	}
	
	//METODO
	public void agregarHabitacion(Habitacion habitacion) {
		this.listaHabitaciones.add(habitacion);	
	}
	public void mostrarHabitaciones() {
		for(Habitacion habitacion : listaHabitaciones) {
			System.out.println("Tipo habitacion: "+habitacion.getTipoRevestimiento());
		}
	}
	
	//GETTERS AND SETTERS
    public String getDireccion() {
		return direccion;
	}
    public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public List<Habitacion> getListaHabitaciones() {
		return listaHabitaciones;
	}
	public void setListahabitaciones(List<Habitacion> listaHabitaciones) {
		this.listaHabitaciones = listaHabitaciones;
	}
   
	
}
