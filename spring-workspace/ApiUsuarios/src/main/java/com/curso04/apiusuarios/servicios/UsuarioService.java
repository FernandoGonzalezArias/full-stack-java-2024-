package com.curso04.apiusuarios.servicios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.curso04.apiusuarios.modelo.Usuario;

@Service
public class UsuarioService {
	
	private List<Usuario> listaUsuarios = new ArrayList<>();
	
	public List<Usuario> getAllUsers(){
		return listaUsuarios;
		
	}
	
	public Usuario getUserById(String id) {
		for (Usuario usuario : listaUsuarios) {
			if (usuario.getId().equals(id)) {
				return usuario;
			}
		}
		return null;
	}
	
	public Usuario createUser(String nombre, String correo) {
		String id = UUID.randomUUID().toString();
		Usuario usuario = new Usuario(id, nombre,correo);
		listaUsuarios.add(usuario);
		return usuario;
	}
	
	public boolean deleteUser(String id) {
		for (Usuario usuario : listaUsuarios) {
			if (usuario.getId().equals(id)) {
				listaUsuarios.remove(usuario);
				return true;
			}
		}
		return false;
		
	}

}









