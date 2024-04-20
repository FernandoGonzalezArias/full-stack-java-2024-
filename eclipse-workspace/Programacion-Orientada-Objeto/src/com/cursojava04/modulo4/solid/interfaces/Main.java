package com.cursojava04.modulo4.solid.interfaces;

public class Main {

	public static void main(String[] args) {
		System.out.println("----------GOKU-----------");
		Goku goku = new Goku();
		goku.tecnicakameHame();
		goku.tecnicaPropia();
		
		System.out.println("----------CHAOS-----------");
		Chaos chaos = new Chaos();
		chaos.tecnicaPropia();
		
		System.out.println("----------KRILIN-----------");
		Krilin krilin = new Krilin();
		krilin.tecnicakameHame();
		krilin.tecnicaPropia();
		
		System.out.println("----------TEN-----------");
		TenShinHan ten = new  TenShinHan();
		ten.tecnicaPropia();
		
		System.out.println("----------YAMSHA-----------");
		Yamsha yamsha = new Yamsha();
		yamsha.tecnicakameHame();
		yamsha.tecnicaPropia();
		

	}

}
