package com.citi.quantum.controllers;

import com.citi.quantum.domain.model.Automovel;
import com.citi.quantum.services.AutomovelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/automovel")
public class AutomovelController {

    @Autowired
    private AutomovelService automovelService;

    @ResponseStatus(HttpStatus.FOUND)
    @GetMapping
    public List<Automovel> buscaTodosAutomoveis() {
        return automovelService.buscaTodosAutomoveis();
    }

    @ResponseStatus(HttpStatus.FOUND)
    @GetMapping("/{id}")
    public Optional<Automovel> buscaAutomovel(@PathVariable Long id) {
        return automovelService.buscaAutomovel(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Automovel criaAutomovel(@RequestBody Automovel automovel) {
        return automovelService.criaAutomovel(automovel);
    }

    @ResponseStatus(HttpStatus.OK)
    @PutMapping("/{id}")
    public Automovel alteraAutomovel(@RequestBody Automovel automovel, @PathVariable Long id){
        return automovelService.alteraAutomovel(automovel, id);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public void excluiAutomovel(@PathVariable Long id) {
        automovelService.excluiAutomovel(id);
    }
}
