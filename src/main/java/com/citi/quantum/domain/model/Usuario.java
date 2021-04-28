package com.citi.quantum.domain.model;

import com.fasterxml.jackson.annotation.*;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@SequenceGenerator(name = "usuario", sequenceName = "SQ_USUARIO", allocationSize = 1)
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "usuario")
    private Long id;
    private String nome;
    private String email;
    private String genero;
    private int telefone;

    @ManyToMany(mappedBy = "usuarios")
    @JsonIgnoreProperties("usuarios")
    List<Grupo> grupos;
}