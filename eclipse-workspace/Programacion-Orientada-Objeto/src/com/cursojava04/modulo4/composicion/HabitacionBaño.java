package com.cursojava04.modulo4.composicion;

public class HabitacionBaño extends Habitacion {
	//ATRIBUTOS
	private boolean tieneBañera;
	private String tipoLavamano;
		
	//CONSTRUCTOR HEREDADO
	public HabitacionBaño(String tipoRevestimiento, int numHabitacion, boolean tieneBañera, String tipoLavamano ) {
		super(tipoRevestimiento, numHabitacion);
		this.tieneBañera = tieneBañera;
		this.tipoLavamano = tipoLavamano;
	}
    
	//GETTERS AND SETTERS
	public boolean isTieneBañera() {
		return tieneBañera;
	}

	public void setTieneBañera(boolean tieneBañera) {
		this.tieneBañera = tieneBañera;
	}

	public String getTipoLavamano() {
		return tipoLavamano;
	}

	public void setTipoLavamano(String tipoLavamano) {
		this.tipoLavamano = tipoLavamano;
	}
	
	//METODOS
	
	
	
	

}
