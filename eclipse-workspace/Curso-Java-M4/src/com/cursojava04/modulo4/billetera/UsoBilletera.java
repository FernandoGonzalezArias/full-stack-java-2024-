package com.cursojava04.modulo4.billetera;

public class UsoBilletera {

	public static void main(String[] args) {
		//ASI SE CREA UN OBJETO
		//INSTANCIA DE LA CLASE BILLETERA
		Billetera billeteraJ4 = new Billetera();
		//ASI EL OBJETO USA UN METODO
		billeteraJ4.consultarSaldo();
		billeteraJ4.retirarSaldo();
		billeteraJ4.transferirSaldo();
		billeteraJ4.ingresarSaldo();
		
		//RETORNAMOS EL METODO SALUDO DE CLASS BILLETREA
		String saludo = billeteraJ4.saludoDiario();
		System.out.println(saludo);
		
		int plata = billeteraJ4.teDevuelvoPlata();
		System.out.println("me gasto mi plata " + plata);
		
	}

}
