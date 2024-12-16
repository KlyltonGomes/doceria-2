package com.back.doceria.nfce.nfceXmlSefaz.DestinatarioXml;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlRootElement(name = "dest")
@XmlType(propOrder = {"CPF","nomeDestinatario"})
public class DestinatarioXmlSefaz {

    private String CPF;
    private String nomeDestinatario;

    @XmlElement(name = "CPF")
    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    @XmlElement(name = "xNome")
    public String getNomeDestinatario() {
        return nomeDestinatario;
    }

    public void setNomeDestinatario(String nomeDestinatario) {
        this.nomeDestinatario = nomeDestinatario;
    }
}
