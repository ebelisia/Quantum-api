package com.citi.quantum.domain.repository;

import com.citi.quantum.domain.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    List<Usuario> findByNome(String nome);
    List<Usuario> findById(Long id);
}
