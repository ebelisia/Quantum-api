package com.citi.quantum.domain.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import java.math.BigDecimal;

@Data
@Entity
@PrimaryKeyJoinColumn(name = "patrimonio_id", referencedColumnName = "id")
public class Imovel extends Patrimonio {

    private BigDecimal iptu;
    private BigDecimal valorCondominio;
}
