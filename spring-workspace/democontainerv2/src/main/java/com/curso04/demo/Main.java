package com.curso04.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context =
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		Empleado empleado = context.getBean(Empleado.class);
		
		empleado.setId(1);
		empleado.setDepartamento("TI");
		empleado.setNombre("Raw");
		
		System.out.println(empleado);
		
		



	}

}
