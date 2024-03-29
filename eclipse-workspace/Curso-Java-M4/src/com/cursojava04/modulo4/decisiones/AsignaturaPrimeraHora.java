package com.cursojava04.modulo4.decisiones;
import java.util.Scanner;

public class AsignaturaPrimeraHora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el día de la semana:");
        String diaSemana = scanner.nextLine();

        String asignaturaPrimeraHora = obtenerAsignaturaPrimeraHora(diaSemana.toLowerCase());

        if (asignaturaPrimeraHora != null) {
            System.out.println("El día " + diaSemana + " a primera hora tienes la asignatura de " + asignaturaPrimeraHora + ".");
        } else {
            System.out.println("No se encontró información sobre la asignatura a primera hora para el día " + diaSemana + ".");
        }

        scanner.close();
    }

    public static String obtenerAsignaturaPrimeraHora(String diaSemana) {
        switch (diaSemana) {
            case "lunes":
                return "Matemáticas";
            case "martes":
                return "Ciencias Naturales";
            case "miércoles":
                return "Historia";
            case "jueves":
                return "Lengua y Literatura";
            case "viernes":
                return "Educación Física";
            default:
                return null;
        }
    }
}
