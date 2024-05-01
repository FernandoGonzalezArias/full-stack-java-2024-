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
		
		listaClientes.add(c1);
		listaClientes.add(c2);
		listaClientes.add(c3);
		listaClientes.add(c4);
		listaClientes.add(c5);
		
		return listaClientes;
		
	}

}
