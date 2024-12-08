package com.back.doceria.pdv.dto;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


@XmlRootElement(name = "emit")
@XmlType(propOrder = {"cnpj", "nome"})
public class EmitenteXml {


    private String cnpj;
    private String nome;


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


}
