package com.citi.quantum.services;

import com.citi.quantum.domain.model.Imovel;
import com.citi.quantum.domain.repository.ImovelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ImovelService {

    @Autowired
    private ImovelRepository imovelRepository;

    public List<Imovel> buscaTodosImoveis(){
        return imovelRepository.findAll();
    }

    public Optional<Imovel> buscaImovel(Long id){
        return imovelRepository.findById(id);
    }

    public Imovel criaImovel(Imovel imovel){
        return imovelRepository.save(imovel);
    }

    public Imovel alteraImovel(Imovel imovel, Long id){
        imovel.setId(id);
        return imovelRepository.save(imovel);
    }

    public void excluiImovel(Long id){
        imovelRepository.deleteById(id);
    }
}
