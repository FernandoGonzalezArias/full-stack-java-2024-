package com.curso04.apiusuarios.controladores;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.curso04.apiusuarios.modelo.Usuario;
import com.curso04.apiusuarios.servicios.UsuarioService;

@RestController
@RequestMapping("/api/users")
public class UserController {
	
	private final UsuarioService usuarioService;

	public UserController(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}
	
	@GetMapping
	public List<Usuario> getAllUsers(){
		return usuarioService.getAllUsers();
		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Usuario> getUserById(@PathVariable String id){
		Usuario usuario = usuarioService.getUserById(id);
		if (usuario != null) {
			return ResponseEntity.ok(usuario);
		}else {
			return ResponseEntity.notFound().build();
		}
	}
	
	@PostMapping
	public Usuario createUser(@RequestParam String nombre,@RequestParam String correo) {
		return usuarioService.createUser(nombre, correo);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteUser(@PathVariable String id){
		boolean idDeleted = usuarioService.deleteUser(id);
		if (idDeleted) {
			return ResponseEntity.ok().build();
		}else {
			return ResponseEntity.notFound().build();
		}
	}
	

}

















