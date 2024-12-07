package com.back.doceria.pdv.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Nfce {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private Emitente emitente;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Produto> produtos;

    private Double total;
    private Double impostos;
    private String formaPagamento;



}
