package com.back.doceria.pdv.dto;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlRootElement(name = "prod")
@XmlType(propOrder = {"codigo", "nome", "quantidade", "valorUnitario", "valorTotal"}) // Ajustado para refletir os nomes reais
public class ProdutoXml {

    private String codigo;
    private String nome;
    private int quantidade;
    private double valorUnitario;
    private double valorTotal;

    @XmlElement(name = "cProd")
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @XmlElement(name = "xProd")
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    @XmlElement(name = "qCom")
    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    @XmlElement(name = "vUnCom")
    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }
    @XmlElement(name = "vProd")
    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
}

