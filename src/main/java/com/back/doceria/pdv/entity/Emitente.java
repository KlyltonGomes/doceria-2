package com.back.doceria.pdv.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Emitente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String cnpj; // CNPJ da empresa
    private String nome; // Nome da empresa
    private String nomeFantasia; // Nome fantasia da empresa
    private String codigoCnae; // Código CNAE
    private String inscricaoEstadual; // Inscrição estadual
    private String inscricaoMunicipal; // Inscrição municipal (opcional)
    private String regimeTributario; // Regime tributário

    @OneToOne
    private Endereco endereco;
}
