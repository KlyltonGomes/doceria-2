package com.back.doceria.nfce.nfceXmlSefaz.EnderecoXml;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlRootElement(name = "enderEmit")
@XmlType(propOrder = {"logradouro","numero","complemento",
        "bairro","codigoMunicipio","nomeMunicipio","unidadeFederativa","cep","codigoPais","nomePais","telefone"})
public class EnderecoXmlSefaz {

    private String logradouro;
    private Integer numero;
    private String complemento;
    private String bairro;
    private String codigoMunicipio;
    private String nomeMunicipio;
    private Integer unidadeFederativa;
    private Integer cep;
    private Integer codigoPais;
    private String nomePais;
    private String telefone;



    @XmlElement(name = "xLgr")
    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }
    @XmlElement(name = "nro")
    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }
    @XmlElement(name = "xCpl")
    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    @XmlElement(name = "xBairro")
    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    @XmlElement(name = "cMun")
    public String getCodigoMunicipio() {
        return codigoMunicipio;
    }

    public void setCodigoMunicipio(String codigoMunicipio) {
        this.codigoMunicipio = codigoMunicipio;
    }
    @XmlElement(name = "xMun")
    public String getNomeMunicipio() {
        return nomeMunicipio;
    }

    public void setNomeMunicipio(String nomeMunicipio) {
        this.nomeMunicipio = nomeMunicipio;
    }
    @XmlElement(name = "UF")
    public Integer getUnidadeFederativa() {
        return unidadeFederativa;
    }

    public void setUnidadeFederativa(Integer unidadeFederativa) {
        this.unidadeFederativa = unidadeFederativa;
    }
    @XmlElement(name = "CEP")
    public Integer getCep() {
        return cep;
    }

    public void setCep(Integer cep) {
        this.cep = cep;
    }
    @XmlElement(name = "cPais")
    public Integer getCodigoPais() {
        return codigoPais;
    }


    public void setCodigoPais(Integer codigoPais) {
        this.codigoPais = codigoPais;
    }
    @XmlElement(name = "xPais")
    public String getNomePais() {
        return nomePais;
    }

    public void setNomePais(String nomePais) {
        this.nomePais = nomePais;
    }
    @XmlElement(name = "fone")
    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }


}
