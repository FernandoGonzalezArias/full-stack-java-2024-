package com.cursojava04.modulo4.agregacion;

public class FabricaAutos {

	public static void main(String[] args) {
		
		Motor miMotor = new Motor("Gasolina");
		Auto miAuto = new Auto("Audi", miMotor);
		
		miAuto.getMarca();
		miAuto.getMotor().getTipo();
		System.out.println(miAuto.getMarca()+" "+miAuto.getMotor().getTipo());
	}

}
