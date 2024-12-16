package com.back.doceria.nfce.nfceXmlSefaz.EmitenteXml;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlRootElement(name = "emit")
@XmlType(propOrder = {"CNPJ", "razaoSocial", "nomeFantasia","inscricaoEstadual","codAtividadeEco","codRegimeTributario"})

public class EmitenteXmlSefaz {

    private String CNPJ;
    private String razaoSocial;
    private String nomeFantasia;
    private Integer inscricaoEstadual;
    private Integer codAtividadeEco;
    private Integer codRegimeTributario;



    @XmlElement(name = "CNPJ")
    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }
    @XmlElement(name = "xNome")
    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
    @XmlElement(name = "xFant")
    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }
    @XmlElement(name = "IE")
    public Integer getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(Integer inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }
    @XmlElement(name = "CNAE")
    public Integer getCodAtividadeEco() {
        return codAtividadeEco;
    }

    public void setCodAtividadeEco(Integer codAtividadeEco) {
        this.codAtividadeEco = codAtividadeEco;
    }
    @XmlElement(name = "CRT")
    public Integer getCodRegimeTributario() {
        return codRegimeTributario;
    }

    public void setCodRegimeTributario(Integer codRegimeTributario) {
        this.codRegimeTributario = codRegimeTributario;
    }
}
