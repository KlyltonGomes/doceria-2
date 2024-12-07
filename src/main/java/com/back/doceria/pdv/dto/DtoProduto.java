package com.back.doceria.pdv.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data

public class DtoProduto {


    private String nome;
    private Double preco;

    public DtoProduto( String nome, Double preco) {

        this.nome = nome;
        this.preco = preco;
    }
}
