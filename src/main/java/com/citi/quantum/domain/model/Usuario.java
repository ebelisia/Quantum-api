package com.citi.quantum.domain.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@SequenceGenerator(name = "usuario", sequenceName = "SQ_USUARIO", allocationSize = 1)
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "usuario")
    private Long id;
    private String nome;

    public void setCodigo(int id) {
    }
}
