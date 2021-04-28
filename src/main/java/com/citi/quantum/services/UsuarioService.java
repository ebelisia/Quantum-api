package com.citi.quantum.services;

import com.citi.quantum.domain.model.Usuario;
import com.citi.quantum.domain.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> buscaTodosUsuario() {
        return usuarioRepository.findAll();
    }

    public Optional<Usuario> buscaUsuario(Long id) {
        return usuarioRepository.findById(id);
    }

    public Usuario criaUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public Usuario alteraUsuario(Usuario usuario, Long id) {
        usuario.setId(id);
        return usuarioRepository.save(usuario);
    }

    public void excluiUsuario(Long id) {
        usuarioRepository.deleteById(id);
    }
}
