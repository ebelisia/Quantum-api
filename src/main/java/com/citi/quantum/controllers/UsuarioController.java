package com.citi.quantum.controllers;

import com.citi.quantum.domain.model.Usuario;
import com.citi.quantum.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @ResponseStatus(HttpStatus.FOUND)
    @GetMapping
    public List<Usuario> buscaTodosUsuarios(){
        return usuarioService.buscaTodosUsuario();
    }

    @ResponseStatus(HttpStatus.FOUND)
    @GetMapping("/{id}")
    public Optional<Usuario> buscaUsuario(@PathVariable Long id){
        return usuarioService.buscaUsuario(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Usuario criaUsuario(@RequestBody Usuario usuario) {
        return usuarioService.criaUsuario(usuario);

}
    @ResponseStatus(HttpStatus.OK)
    @PutMapping("/{id}")
    public Usuario alteraUsuario(@RequestBody Usuario usuario, @PathVariable Long id){
        return usuarioService.alteraUsuario(usuario, id);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public void excluiUsuario(@PathVariable Long id) {
        usuarioService.excluiUsuario(id);
    }
}
