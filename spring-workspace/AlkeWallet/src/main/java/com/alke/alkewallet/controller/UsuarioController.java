package com.alke.alkewallet.controller;

import com.alke.alkewallet.model.Usuario;
import com.alke.alkewallet.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/registrar")
    public Usuario registrarUsuario(@RequestBody Usuario usuario) {
        return usuarioService.registrarUsuario(usuario);
    }

    @GetMapping("/{email}")
    public Usuario obtenerUsuarioPorEmail(@PathVariable String email) {
        return usuarioService.obtenerUsuarioPorEmail(email);
    }
}
