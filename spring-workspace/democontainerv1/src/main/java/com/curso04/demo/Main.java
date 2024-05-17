package com.curso04.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Empleado empleado = (Empleado) context.getBean("empleado");
		
		System.out.println(empleado);

	}

}
