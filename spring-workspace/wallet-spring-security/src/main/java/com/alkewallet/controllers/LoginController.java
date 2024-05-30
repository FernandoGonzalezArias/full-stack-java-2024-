package com.alkewallet.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	@GetMapping("/login")
	public String login() {
		return "login"; // nombre del archivo HTML sin extensión
	}

//	@PostMapping("/login")
//	public String processLogin(@RequestParam String username, @RequestParam String password) {
//		// Aquí puedes agregar la lógica para autenticar al usuario
//		// Por ejemplo, redirigir a una página de bienvenida o mostrar un mensaje de
//		// error
//		return "redirect:/welcome"; // o "login" si falla la autenticación
//	}

}
