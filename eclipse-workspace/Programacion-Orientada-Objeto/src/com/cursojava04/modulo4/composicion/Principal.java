package com.cursojava04.modulo4.composicion;

public class Principal {

	public static void main(String[] args) {
		Casa miCasa = new Casa("Calle siempre viva #123");
		Habitacion h1 = new Habitacion("Sala de estar", 12);
		Habitacion h2 = new Habitacion("Dormitorio", 13);
		Habitacion h3 = new Habitacion("Dormitorio niños", 14);
		Habitacion h4 = new Habitacion("Sala de cine", 15);
		Habitacion h5 = new Habitacion("Vip", 16);
		
		System.out.println(miCasa.getDireccion());
		
        miCasa.agregarHabitacion(h1);
        miCasa.agregarHabitacion(h2);
        miCasa.agregarHabitacion(h3);
        miCasa.agregarHabitacion(h4);
        miCasa.agregarHabitacion(h5);
        
        miCasa.mostrarHabitaciones();
	}

}
