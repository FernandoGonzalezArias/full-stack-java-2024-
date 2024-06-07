package com.alke.alkewallet.service;

import com.alke.alkewallet.model.Usuario;
import com.alke.alkewallet.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario registrarUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public Usuario obtenerUsuarioPorEmail(String email) {
        return usuarioRepository.findByEmail(email);
    }
}
