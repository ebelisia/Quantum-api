package com.citi.quantum.domain.repository;

import com.citi.quantum.domain.model.Imovel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImovelRepository extends JpaRepository<Imovel, Long> {
}
