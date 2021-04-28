package com.citi.quantum.controllers;

import com.citi.quantum.domain.model.Imovel;
import com.citi.quantum.services.ImovelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/imovel")
public class ImovelController {

    @Autowired
    private ImovelService imovelService;

    @ResponseStatus(HttpStatus.FOUND)
    @GetMapping
    public List<Imovel> buscaTodosImoveis(){
        return imovelService.buscaTodosImoveis();
    }

    @ResponseStatus(HttpStatus.FOUND)
    @GetMapping("/{id}")
    public Optional<Imovel> buscaImovel(@PathVariable Long id){
        return imovelService.buscaImovel(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Imovel criaImovel(@RequestBody Imovel imovel){
        return imovelService.criaImovel(imovel);
    }

    @ResponseStatus(HttpStatus.OK)
    @PutMapping("/{id}")
    public Imovel alteraImovel(@RequestBody Imovel imovel, @PathVariable Long id){
        return imovelService.alteraImovel(imovel, id);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public void excluiImovel(@PathVariable Long id){
        imovelService.excluiImovel(id);
    }
}
