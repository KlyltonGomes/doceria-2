package com.back.doceria.nfce.nfceXmlSefaz.IdentificacaoXml;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@XmlRootElement(name = "ide")
@XmlType(propOrder = {"unidadeFederativa", "naturezaOperacao", "modeloNF", "serieNF", "numeroNF", "datahoraEmi", "tipoNF",
        "destinoOperacao", "codigoMunFG", "tipoImp", "tipoEmis", "codigoDV",
        "tipoAmb", "indicadorFinal", "indicadorPres", "processoEmi", "versaoProc"})
public class IdeXmlSefaz {

    //ide
    private Integer unidadeFederativa; // Unidade Federativa (sigla do estado)
    private String naturezaOperacao; // Natureza da Operação "venda"
    private Integer modeloNF; // Modelo do Documento Fiscal
    private Integer serieNF; // Série do documento fiscal
    private Integer numeroNF; // Número da Nota Fiscal
    private String datahoraEmi; // Data e hora de emissão no formato ISO 8601
    private Integer tipoNF; // Tipo de operação: 0=Entrada, 1=Saída
    private Integer destinoOperacao; // Destino da operação: 1=Interna, 2=Interestadual, 3=Exterior
    private Integer codigoMunFG; // Código do município do fato gerador
    private Integer tipoImp; // Formato de impressão: 0=Sem DANFE, 1=Retrato, etc.
    private Integer tipoEmis; // Tipo de emissão: 1=Normal, 2=Contingência, etc.
    private Integer codigoDV; // Dígito verificador da chave de acesso
    private Integer tipoAmb; // Ambiente: 1=Produção, 2=Homologação
    private Integer indicadorFinal; // Indicador de consumidor final: 0=Não, 1=Sim
    private Integer indicadorPres; // Indicador de presença: 0=Não se aplica, 1=Presencial, etc.
    private Integer processoEmi; // Processo de emissão: 0=Aplicativo contribuinte, etc.
    private String versaoProc; // Versão do aplicativo emissor

    @XmlElement(name = "UF")
    public Integer getUnidadeFederativa() {
        return unidadeFederativa;
    }

    public void setUnidadeFederativa(Integer unidadeFederativa) {
        this.unidadeFederativa = unidadeFederativa;
    }
    @XmlElement(name = "natOp")
    public String getNaturezaOperacao() {
        return naturezaOperacao;
    }

    public void setNaturezaOperacao(String naturezaOperacao) {
        this.naturezaOperacao = naturezaOperacao;
    }
    @XmlElement(name = "mod")
    public Integer getModeloNF() {
        return modeloNF;
    }

    public void setModeloNF(Integer modeloNF) {
        this.modeloNF = modeloNF;
    }
    @XmlElement(name = "serie")
    public Integer getSerieNF() {
        return serieNF;
    }

    public void setSerieNF(Integer serieNF) {
        this.serieNF = serieNF;
    }
    @XmlElement(name = "nNF")
    public Integer getNumeroNF() {
        return numeroNF;
    }

    public void setNumeroNF(Integer numeroNF) {
        this.numeroNF = numeroNF;
    }
    @XmlElement(name = "dhEmi")
    public String getDatahoraEmi() {
        return datahoraEmi;
    }

    public void setDatahoraEmi(String datahoraEmi) {
        this.datahoraEmi = datahoraEmi;
    }
    // Método utilitário para facilitar o uso de LocalDateTime
    public void setDatahoraEmi(LocalDateTime datahoraEmi) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");
        this.datahoraEmi = datahoraEmi.format(formatter);
    }

    @XmlElement(name = "tpNF")
    public Integer getTipoNF() {
        return tipoNF;
    }

    public void setTipoNF(Integer tipoNF) {
        this.tipoNF = tipoNF;
    }
    @XmlElement(name = "idDest")
    public Integer getDestinoOperacao() {
        return destinoOperacao;
    }

    public void setDestinoOperacao(Integer destinoOperacao) {
        this.destinoOperacao = destinoOperacao;
    }
    @XmlElement(name = "cMunFG")
    public Integer getCodigoMunFG() {
        return codigoMunFG;
    }

    public void setCodigoMunFG(Integer codigoMunFG) {
        this.codigoMunFG = codigoMunFG;
    }
    @XmlElement(name = "tpImp")
    public Integer getTipoImp() {
        return tipoImp;
    }

    public void setTipoImp(Integer tipoImp) {
        this.tipoImp = tipoImp;
    }
    @XmlElement(name = "tpEmis")
    public Integer getTipoEmis() {
        return tipoEmis;
    }

    public void setTipoEmis(Integer tipoEmis) {
        this.tipoEmis = tipoEmis;
    }
    @XmlElement(name = "cDV")
    public Integer getCodigoDV() {
        return codigoDV;
    }

    public void setCodigoDV(Integer codigoDV) {
        this.codigoDV = codigoDV;
    }
    @XmlElement(name = "tpAmb")
    public Integer getTipoAmb() {
        return tipoAmb;
    }

    public void setTipoAmb(Integer tipoAmb) {
        this.tipoAmb = tipoAmb;
    }

    @XmlElement(name = "indFinal")
    public Integer getIndicadorFinal() {
        return indicadorFinal;
    }

    public void setIndicadorFinal(Integer indicadorFinal) {
        this.indicadorFinal = indicadorFinal;
    }
    @XmlElement(name = "indPres")
    public Integer getIndicadorPres() {
        return indicadorPres;
    }

    public void setIndicadorPres(Integer indicadorPres) {
        this.indicadorPres = indicadorPres;
    }
    @XmlElement(name = "procEmi")
    public Integer getProcessoEmi() {
        return processoEmi;
    }

    public void setProcessoEmi(Integer processoEmi) {
        this.processoEmi = processoEmi;
    }
    @XmlElement(name = "verProc")
    public String getVersaoProc() {
        return versaoProc;
    }

    public void setVersaoProc(String versaoProc) {
        this.versaoProc = versaoProc;
    }
}
