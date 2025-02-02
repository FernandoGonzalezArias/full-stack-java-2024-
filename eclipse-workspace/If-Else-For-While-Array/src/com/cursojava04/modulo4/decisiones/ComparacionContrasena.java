package com.cursojava04.modulo4.decisiones;

import java.util.Scanner;

public class ComparacionContrasena {
    public static void main(String[] args) {
        // Contraseña almacenada en una variable
        String contrasenaAlmacenada = "contraseña";

        Scanner scanner = new Scanner(System.in);

        // Preguntar al usuario por la contraseña
        System.out.println("Ingresa la contraseña:");
        String contrasenaUsuario = scanner.nextLine();

        // Comparar ambas contraseñas sin tener en cuenta mayúsculas y minúsculas
        if (contrasenaAlmacenada.equalsIgnoreCase(contrasenaUsuario)) {
            System.out.println("La contraseña es correcta");
        } else {
            System.out.println("La contraseña es incorrecta");
        }

        scanner.close();
    }
}
