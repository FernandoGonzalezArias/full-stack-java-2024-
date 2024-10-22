package com.cursojava04.modulo4.encapsulamiento;

public class Persona {
	//ATRIBUTOS DE LA CLASE
	private String tipoFamilia;
	private String nombre;
	private int edad;
	private String rut;
	
	//CONSTRUCTOR
	public Persona(String tipoFamiliaExterno, String nombreExterno, int edadExterna, String rutExterno ) {
		this.tipoFamilia = tipoFamiliaExterno;
		this.nombre = nombreExterno;
		this.edad = edadExterna;
		this.rut = rutExterno;
	}
	
	// GETTER Y SETTER
	
	//-------------------------------------------------------------------
	
	// ATRIBUTO TIPO FAMILIA
	//SETTER (DAR VALOR)
	public void setTipoFamilia(String tipoFamilia) {
		this.tipoFamilia = tipoFamilia;
	}
	//GETTER (OBTENER VALOR)
	public String getTipoFamilia() {
		return this.tipoFamilia;
	}
	
	//---------------------------------------------------------------------
	
	//ATRIBUTO NOMBRE
	//GETTER (OBTENER VALOR)
	public String getNombre() {
		return this.nombre;
	}
	//SETTER (DAR VALOR)
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	//------------------------------------------------------------------------
	
	//ATRIBUTO EDAD
	//GETTER (OBTENER VALOR)
	public int getEdad() {
		return edad;
	}
	//SETTER (DAR VALOR)
    public void setEdad(int edad) {
		this.edad = edad;
	}

    //------------------------------------------------------------------------
    
    //ATRIBUTO RUT
  	//GETTER (OBTENER VALOR)
	public String getRut() {
		return rut;
	}
	//SETTER (DAR VALOR)
	public void setRut(String rut) {
		this.rut = rut;
	}
	
	//------------------------------------------------------------------------

	//METODOS DE LA CLASE
	public void presentarDatos() {
		System.out.println("Presentando ");
	}
	private void respirar() {
		System.out.println("Respirando");
	}
	
	//-------------------------------------------------------------------------

}
