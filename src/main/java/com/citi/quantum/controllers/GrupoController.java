package com.citi.quantum.controllers;

import com.citi.quantum.domain.model.Grupo;
import com.citi.quantum.services.GrupoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/grupo")
public class GrupoController {

    @Autowired
    private GrupoService grupoService;

    @ResponseStatus(HttpStatus.FOUND)
    @GetMapping
    public List<Grupo> buscaTodosGrupos(){
        return grupoService.buscaTodosGrupos();
    }

    @ResponseStatus(HttpStatus.FOUND)
    @GetMapping("/{id}")
    public Optional<Grupo> buscaGrupo(@PathVariable Long id){
        return grupoService.buscaGrupo(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Grupo criaGrupo(@RequestBody Grupo grupo){
        return grupoService.criaGrupo(grupo);
    }

    @ResponseStatus(HttpStatus.OK)
    @PutMapping("/{id}")
    public Grupo alteraGrupo(@RequestBody Grupo grupo, @PathVariable Long id){
        return grupoService.alteraGrupo(grupo, id);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public void excluirGrupo(@PathVariable Long id) {
        grupoService.excluiGrupo(id);
    }

}
