package com.cursojava04.modulo4.arreglolistas;

import java.util.ArrayList;

public class UsandoListas {

	public static void main(String[] args) {
		UsandoListas lista = new UsandoListas();
		lista.ejemploArrayList();
		lista.curso();

	}
	
	public void ejemploArrayList() {
		ArrayList<String> listaFrutas = new ArrayList<>();
		// AGREGAMOS FRUTAS
		listaFrutas.add("Manzana");
		listaFrutas.add("Peras");
		listaFrutas.add("Kiwis");
		listaFrutas.add("Arandanos");
		// ASI SE VE TODA LA LISTA
		System.out.println(listaFrutas);
		// CON EL GET SE ACCEDE A UN ELEMENTO EN ESPECIFICO
		System.out.println(listaFrutas.get(0));
		
	   System.out.println("------FOR EACH--------");
		for (String fruta : listaFrutas) {
			System.out.println(fruta);
		}
		
		System.out.println("------------REMOVEMOS LAS UVAS-----------");
		listaFrutas.remove(3);
		
		for (String fruta : listaFrutas) {
			System.out.println(fruta);
		}
		
	}
	
	public void curso() {
		ArrayList<String> alumnos = new ArrayList<String>();
		System.out.println("------------LISTA ALUMNOS-----------");
		
		alumnos.add("Fernando");
		alumnos.add("Matriz");
		alumnos.add("Estring");
		alumnos.add("Forish");
		alumnos.add("Swichcase");
		
		for (String alum : alumnos) {
			System.out.println(alum);
		}
		
		System.out.println("-------VERIFICAR SI EXISTE ALUMNO FORISH--------");
		System.out.println("Existe el elumno Forish? " + alumnos.contains("Forish"));
		
		System.out.println("-------CUANTOS ELEMENTOS TENGO--------");
		System.out.println("Cuantos alumnos hay? " + alumnos.size());
		
		
	}

}
