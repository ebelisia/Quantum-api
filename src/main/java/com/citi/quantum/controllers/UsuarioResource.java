package com.citi.quantum.controllers;

import com.citi.quantum.domain.model.Usuario;
import com.citi.quantum.domain.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("usuario")
public class UsuarioResource {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping
    public List<Usuario> listar(){
        return usuarioRepository.findAll();
    }

    @GetMapping({"codigo"})
    public Usuario buscar(@PathVariable int codigo){
        return usuarioRepository.findById(codigo).get();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Usuario cadastrar(@RequestBody Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    @PutMapping({"id"})
    public Usuario atualizar(@RequestBody Usuario usuario, @PathVariable int id){
        usuario.setCodigo(id);
        return usuarioRepository.save(usuario);
    }

    @DeleteMapping("pesquisa")
    public void remover(@PathVariable int codigo) {
        usuarioRepository.deleteById(codigo);
    }
}
