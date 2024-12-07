package com.back.doceria.pdv.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String logradouro; // Endereço
    private String numero; // Número do endereço
    private String bairro; // Bairro do endereço
    private String cidade; // Cidade
    private String uf; // UF
    private String cep; // CEP
    private String codigoMunicipio; // Código IBGE da cidade
    private String nomeMunicipio; // Nome da cidade
}
