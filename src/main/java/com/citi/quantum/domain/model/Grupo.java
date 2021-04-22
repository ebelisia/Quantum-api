package com.citi.quantum.domain.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@SequenceGenerator(name = "grupo", sequenceName = "SQ_GRUPO", allocationSize = 1)
public class Grupo {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "grupo")
    private Long id;
    private String nome;

}