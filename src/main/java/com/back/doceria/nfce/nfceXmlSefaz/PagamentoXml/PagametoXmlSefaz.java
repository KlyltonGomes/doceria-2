package com.back.doceria.nfce.nfceXmlSefaz.PagamentoXml;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

import java.math.BigDecimal;

@XmlRootElement(name = "pag")
@XmlType(propOrder = {"tipoPagamento","totalPagamento"})
public class PagametoXmlSefaz {

    private Integer tipoPagamento;
    private BigDecimal totalPagamento;
    @XmlElement(name = "tPag")
    public Integer getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(Integer tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }
    @XmlElement(name = "vPag")
    public BigDecimal getTotalPagamento() {
        return totalPagamento;
    }

    public void setTotalPagamento(BigDecimal totalPagamento) {
        this.totalPagamento = totalPagamento;
    }
}
