package com.back.doceria.pdv.dto;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


@XmlRootElement(name = "emit")
@XmlType(propOrder = {"cnpj", "nome","nomeFantasia","codigoCnae","inscricaoEstadual","inscricaoMunicipal","regimeTributario"})
public class EmitenteXml {


    private String cnpj;
    private String nome;
    private String nomeFantasia; // Nome fantasia da empresa
    private String codigoCnae; // Código CNAE
    private String inscricaoEstadual; // Inscrição estadual
    private String inscricaoMunicipal; // Inscrição municipal (opcional)
    private String regimeTributario; // Regime tributário


    @XmlElement(name = "CNPJ")
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    @XmlElement(name = "xNome")
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @XmlElement(name = "xFant")
    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    @XmlElement(name = "CNAE")
    public String getCodigoCnae() {
        return codigoCnae;
    }

    public void setCodigoCnae(String codigoCnae) {
        this.codigoCnae = codigoCnae;
    }

    @XmlElement(name = "IE")
    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    @XmlElement(name = "IM")
    public String getInscricaoMunicipal() {
        return inscricaoMunicipal;
    }

    public void setInscricaoMunicipal(String inscricaoMunicipal) {
        this.inscricaoMunicipal = inscricaoMunicipal;
    }

    @XmlElement(name = "CRT")
    public String getRegimeTributario() {
        return regimeTributario;
    }

    public void setRegimeTributario(String regimeTributario) {
        this.regimeTributario = regimeTributario;
    }

    @Override
    public String toString() {
        return cnpj;
    }

}
