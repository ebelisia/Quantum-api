package com.citi.quantum.domain.model;

import com.fasterxml.jackson.annotation.*;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@SequenceGenerator(name = "grupo", sequenceName = "SQ_GRUPO", allocationSize = 1)
public class Grupo {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "grupo")
    private Long id;
    private String nome;

    @ManyToMany
    @JoinTable(name = "GRUPO_USUARIO", joinColumns = @JoinColumn(name = "grupo_id"), inverseJoinColumns = @JoinColumn(name = "usuario_id"))
    @JsonIgnoreProperties("grupos")
    List<Usuario> usuarios;

}