package com.citi.quantum.domain.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@Data
@PrimaryKeyJoinColumn(name = "patrimonio_id", referencedColumnName = "id")
public class Automovel extends Patrimonio{

    private String placa;
    private String marca;
}
