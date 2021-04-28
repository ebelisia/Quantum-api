package com.citi.quantum.services;

import com.citi.quantum.domain.model.Automovel;
import com.citi.quantum.domain.repository.AutomovelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AutomovelService {

    @Autowired
    private AutomovelRepository automovelRepository;

    public List<Automovel> buscaTodosAutomoveis() {
        return automovelRepository.findAll();
    }

    public Optional<Automovel> buscaAutomovel(Long id) {
        return automovelRepository.findById(id);
    }

    public Automovel criaAutomovel(Automovel automovel) {
        return automovelRepository.save(automovel);
    }

    public Automovel alteraAutomovel(Automovel automovel, Long id) {
        automovel.setId(id);
        return automovelRepository.save(automovel);
    }

    public void excluiAutomovel(Long id) {
        automovelRepository.deleteById(id);
    }
}
