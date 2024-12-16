package com.back.doceria.pdv.dto;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

import javax.lang.model.element.Name;

@XmlRootElement(name = "total")
@XmlType(propOrder = {"valorTotal","valorDesconto"})
public class TotalXml {


    private double valorTotal;
    private double valorDesconto;

    @XmlElement(name = "vPag")
    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
    @XmlElement(name = "vDesc")
    public double getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }
}
