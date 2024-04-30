package com.curso04.login.mvc.modelo.servicios;

import com.curso04.login.mvc.modelo.Usuario;

public class UsuarioService {
	
	public boolean validarUsuario(Usuario usuario) {
		
		
		return usuario.getUsuario().equals("user") && 
			   usuario.getPassword().equals("1234");
	}

}
