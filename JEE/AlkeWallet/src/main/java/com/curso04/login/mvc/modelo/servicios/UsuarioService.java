package com.curso04.login.mvc.modelo.servicios;

import com.curso04.login.mvc.constantes.Constants;
import com.curso04.login.mvc.modelo.Usuario;

public class UsuarioService {
	
	public boolean validarUsuario(Usuario usuario) {
		
		
		return usuario.getUsuario().equals(Constants.USUARIO_TEST) && 
			   usuario.getPassword().equals(Constants.PASSWORD_TEST);
	}

}
