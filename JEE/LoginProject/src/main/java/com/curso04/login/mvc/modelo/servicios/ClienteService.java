package com.curso04.login.mvc.modelo.servicios;

import java.util.ArrayList;
import java.util.List;

import com.curso04.login.mvc.modelo.Cliente;

public class ClienteService {
	
	public List<Cliente> obtenerListaClientes() {
		
		List<Cliente> listaClientes = new ArrayList<Cliente>();
		Cliente c1 = new Cliente("pepito", "gonzalez", "los pinos 123");
		Cliente c2 = new Cliente("juan", "perez", "los camotes 123");
		Cliente c3 = new Cliente("pedro", "ramirez", "los perros 123");
		Cliente c4 = new Cliente("cristobal", "sanchez", "los piratas 123");
		Cliente c5 = new Cliente("max", "lira", "los niños 123");
		Cliente c6 = new Cliente("pepito", "gonzalez", "los pinos 123");
		Cliente c7 = new Cliente("juan", "perez", "los camotes 123");
		Cliente c8 = new Cliente("pedro", "ramirez", "los perros 123");
		Cliente c9 = new Cliente("cristobal", "sanchez", "los piratas 123");
		Cliente c10 = new Cliente("max", "lira", "los niños 123");
		Cliente c11 = new Cliente("pepito", "gonzalez", "los pinos 123");
		Cliente c12 = new Cliente("juan", "perez", "los camotes 123");
		Cliente c13 = new Cliente("pedro", "ramirez", "los perros 123");
		Cliente c14 = new Cliente("cristobal", "sanchez", "los piratas 123");
		Cliente c15 = new Cliente("max", "lira", "los niños 123");
		Cliente c16 = new Cliente("pepito", "gonzalez", "los pinos 123");
		Cliente c17 = new Cliente("juan", "perez", "los camotes 123");
		Cliente c18 = new Cliente("pedro", "ramirez", "los perros 123");
		Cliente c19 = new Cliente("cristobal", "sanchez", "los piratas 123");
		Cliente c20 = new Cliente("max", "lira", "los niños 123");
		
		listaClientes.add(c1);
		listaClientes.add(c2);
		listaClientes.add(c3);
		listaClientes.add(c4);
		listaClientes.add(c5);
		listaClientes.add(c6);
		listaClientes.add(c7);
		listaClientes.add(c8);
		listaClientes.add(c9);
		listaClientes.add(c10);
		listaClientes.add(c11);
		listaClientes.add(c12);
		listaClientes.add(c13);
		listaClientes.add(c14);
		listaClientes.add(c15);
		listaClientes.add(c16);
		listaClientes.add(c17);
		listaClientes.add(c18);
		listaClientes.add(c19);
		listaClientes.add(c20);
		
		return listaClientes;
		
	}

}
