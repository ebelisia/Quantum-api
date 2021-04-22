package com.citi.quantum.services;

import com.citi.quantum.domain.model.Grupo;
import com.citi.quantum.domain.repository.GrupoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GrupoService {

    @Autowired
    private GrupoRepository grupoRepository;

    public List<Grupo> buscaTodosGrupos(){
        return grupoRepository.findAll();
    }

    public Optional<Grupo> buscaGrupo(Long id){
        return grupoRepository.findById(id);
    }

    public Grupo criaGrupo(Grupo grupo){
        return grupoRepository.save(grupo);
    }

    public Grupo alteraGrupo(Grupo grupo, Long id){
        grupo.setId(id);
        return grupoRepository.save(grupo);
    }

    public void excluiGrupo(Long id){
        grupoRepository.deleteById(id);
    }

}
