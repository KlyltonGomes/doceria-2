package com.back.doceria.pdv.dto;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlRootElement(name = "pag")
@XmlType(propOrder = {"formaPagamento","valor","troco"})
public class PagamentoXml {

    private Integer formaPagamento; // Tipo de pagamento (01 = dinheiro, 03 = cartão de crédito, etc.)
    private Integer valor; // Valor do pagamento
    private Integer troco;

    @XmlElement(name = "tPag")
    public Integer getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(Integer formaPagamento) {
        this.formaPagamento = formaPagamento;
    }
    @XmlElement(name = "vPag")
    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }
    @XmlElement(name = "vTroco")
    public Integer getTroco() {
        return troco;
    }

    public void setTroco(Integer troco) {
        this.troco = troco;
    }
}
