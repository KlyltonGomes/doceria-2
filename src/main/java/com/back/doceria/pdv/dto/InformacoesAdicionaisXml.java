package com.back.doceria.pdv.dto;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlRootElement(name = "infor")
@XmlType(propOrder = {"informacao"})
public class InformacoesAdicionaisXml {

    private String informacao;

    @XmlElement(name = "infAdicionais")
    public String getInformacao() {
        return informacao;
    }

    public void setInformacao(String informacao) {
        this.informacao = informacao;
    }
}
