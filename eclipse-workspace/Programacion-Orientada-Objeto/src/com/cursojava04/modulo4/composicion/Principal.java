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
        
        System.out.println("------------------------------------------------");
        
        Principal p = new Principal();
        p.principalHerencia();
	}
	
	public void principalHerencia() {
		Casa casaCatalina = new Casa("Los Trapenses");
		HabitacionCocina cocina = new HabitacionCocina("Ceramica", 12, "Adamantium", true);
		HabitacionBaño baño = new HabitacionBaño("Ceramica", 13, true, "Porcelana");
		
		cocina.getTipoRevestimiento();
		
		System.out.println("El revestimiento de la cocina de Catalina es: " 
		                   + cocina.getTipoRevestimiento() 
		                   + " Hubicada en: " 
		                   + casaCatalina.getDireccion());
		cocina.mostrarInfo();
		
		System.out.println("------------------------------------------------------");
		System.out.println("El revestimiento del baño es de: " 
                + baño.getTipoLavamano() 
                + "\nEl número de habitación es: " 
                + baño.getNumHabitacion() 
                + "\n¿Tiene lavamanos?: " 
                + baño.isTieneBañera() 
                + "\nEl tipo de lavamanos es de: " 
                + baño.getTipoLavamano());

		
		
	}

}
