package com.cursojava04.modulo4.composicion;

public class HabitacionCocina extends Habitacion  {
	//ATRIBUTOS
	private String tipoLavadero;
	private boolean TieneMicroondas;
	
    //CONSTRUCTOR HEREDADO
	public HabitacionCocina(String tipoRevestimiento, int numHabitacion, String tipoLavadero, boolean TieneMicroondas) {
		super(tipoRevestimiento, numHabitacion); //PALABRA SUPER HACE EL ENLACE CON CLASE PADRE
		this.tipoLavadero = tipoLavadero;
		this.TieneMicroondas = TieneMicroondas;
	}
    //METODO
 	public void mostrarInfo() {
		System.out.println("Datos de la cocina: " +tipoLavadero + " " 
				+ TieneMicroondas + " " + super.getTipoRevestimiento() 
				+ " " + super.getNumHabitacion());
	}
	
	//GETTERS AND SETTERS
	public String getTipoLavadero() {
		return tipoLavadero;
	}

	public void setTipoLavadero(String tipoLavadero) {
		this.tipoLavadero = tipoLavadero;
	}

	public boolean isTieneMicroondas() {
		return TieneMicroondas;
	}

	public void setTieneMicroondas(boolean tieneMicroondas) {
		TieneMicroondas = tieneMicroondas;
	}
	
}
