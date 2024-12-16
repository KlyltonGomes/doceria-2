package com.back.doceria.pdv.dto;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

import java.time.LocalDateTime;

@XmlRootElement(name = "ide")
@XmlType(propOrder = {"UF","naturezaOperacao","modeloNota","serie","numeroNfce","tipoEmissao","codigo","dataHora","tipoOperacao","destinoOperacao"})
public class IdentificacaoNotaXml {

    private Integer UF;
    private String naturezaOperacao;
    private Integer modeloNota; //65 nfce
    private Integer serie; //1-3
    private Integer numeroNfce; // 1-9
    private Integer tipoEmissao;//1 1=emissao normal,2=contigencia....
    private String codigo;//8 chave de acesso
    private String dataHora;
    private Integer tipoOperacao;// 0=entrada 1=saida
    private Integer destinoOperacao; //1 1=operacao interna, 2=interastadual,3= exterior

    @XmlElement(name = "cUF")
    public Integer getUF() {
        return UF;
    }

    public void setUF(Integer UF) {
        this.UF = UF;
    }
    @XmlElement(name = "natOp")
    public String getNaturezaOperacao() {
        return naturezaOperacao;
    }

    public void setNaturezaOperacao(String naturezaOperacao) {
        this.naturezaOperacao = naturezaOperacao;
    }
    @XmlElement(name = "mod")
    public Integer getModeloNota() {
        return modeloNota;
    }

    public void setModeloNota(Integer modeloNota) {
        this.modeloNota = modeloNota;
    }
    @XmlElement(name = "serie")
    public Integer getSerie() {
        return serie;
    }

    public void setSerie(Integer serie) {
        this.serie = serie;
    }
    @XmlElement(name = "nNF")
    public Integer getNumeroNfce() {
        return numeroNfce;
    }

    public void setNumeroNfce(Integer numeroNfce) {
        this.numeroNfce = numeroNfce;
    }
    @XmlElement(name = "tpEmis")
    public Integer getTipoEmissao() {
        return tipoEmissao;
    }

    public void setTipoEmissao(Integer tipoEmissao) {
        this.tipoEmissao = tipoEmissao;
    }
    @XmlElement(name = "cNF")
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    @XmlElement(name = "dhEmi")
    public String getDataHora() {
        return dataHora;
    }

    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }


    @XmlElement(name = "tpNF")
    public Integer getTipoOperacao() {
        return tipoOperacao;
    }

    public void setTipoOperacao(Integer tipoOperacao) {
        this.tipoOperacao = tipoOperacao;
    }
    @XmlElement(name = "idDest")
    public Integer getDestinoOperacao() {
        return destinoOperacao;
    }

    public void setDestinoOperacao(Integer destinoOperacao) {
        this.destinoOperacao = destinoOperacao;
    }
}
