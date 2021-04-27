package com.citi.quantum.domain.model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Data
@SequenceGenerator(name = "patrimonio", sequenceName = "SQ_PATRIMONIO", allocationSize = 1)
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Patrimonio {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "patrimonio")
    private Long id;
    private String nome;
    private BigDecimal valor;
    private BigDecimal valorSeguro;
    private String observacoes;

}
