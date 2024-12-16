package com.back.doceria.nfce.nfceXmlSefaz.IdentificacaoXml;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class IdeXmlSefazBuilder {

    private IdeXmlSefaz ideXmlSefaz;

    public IdeXmlSefazBuilder() {
        this.ideXmlSefaz = new IdeXmlSefaz();
    }

    public IdeXmlSefazBuilder unidadeFederativa(int unidadeFederativa) {
        ideXmlSefaz.setUnidadeFederativa(unidadeFederativa);
        return this;
    }

    public IdeXmlSefazBuilder naturezaOperacao(String naturezaOperacao) {
        ideXmlSefaz.setNaturezaOperacao(naturezaOperacao);
        return this;
    }

    public IdeXmlSefazBuilder modeloNF(int modeloNF) {
        ideXmlSefaz.setModeloNF(modeloNF);
        return this;
    }

    public IdeXmlSefazBuilder serieNF(int serieNF) {
        ideXmlSefaz.setSerieNF(serieNF);
        return this;
    }

    public IdeXmlSefazBuilder numeroNF(int numeroNF) {
        ideXmlSefaz.setNumeroNF(numeroNF);
        return this;
    }

/*    public IdeXmlSefazBuilder datahoraEmi(LocalDateTime datahoraEmi) {
        ideXmlSefaz.setDatahoraEmi(datahoraEmi);
        return this;
    }*/
    public IdeXmlSefazBuilder datahoraEmi(LocalDateTime datahoraEmi) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");
        ideXmlSefaz.setDatahoraEmi(datahoraEmi.format(formatter));
        return this;
    }


    public IdeXmlSefazBuilder tipoNF(int tipoNF) {
        ideXmlSefaz.setTipoNF(tipoNF);
        return this;
    }

    public IdeXmlSefazBuilder destinoOperacao(int destinoOperacao) {
        ideXmlSefaz.setDestinoOperacao(destinoOperacao);
        return this;
    }

    public IdeXmlSefazBuilder codigoMunFG(int codigoMunFG) {
        ideXmlSefaz.setCodigoMunFG(codigoMunFG);
        return this;
    }

    public IdeXmlSefazBuilder tipoImp(int tipoImp) {
        ideXmlSefaz.setTipoImp(tipoImp);
        return this;
    }

    public IdeXmlSefazBuilder tipoEmis(int tipoEmis) {
        ideXmlSefaz.setTipoEmis(tipoEmis);
        return this;
    }

    public IdeXmlSefazBuilder codigoDV(int codigoDV) {
        ideXmlSefaz.setCodigoDV(codigoDV);
        return this;
    }

    public IdeXmlSefazBuilder tipoAmb(int tipoAmb) {
        ideXmlSefaz.setTipoAmb(tipoAmb);
        return this;
    }

    public IdeXmlSefazBuilder indicadorFinal(int indicadorFinal) {
        ideXmlSefaz.setIndicadorFinal(indicadorFinal);
        return this;
    }

    public IdeXmlSefazBuilder indicadorPres(int indicadorPres) {
        ideXmlSefaz.setIndicadorPres(indicadorPres);
        return this;
    }

    public IdeXmlSefazBuilder processoEmi(int processoEmi) {
        ideXmlSefaz.setProcessoEmi(processoEmi);
        return this;
    }

    public IdeXmlSefazBuilder versaoProc(String versaoProc) {
        ideXmlSefaz.setVersaoProc(versaoProc);
        return this;
    }

    public IdeXmlSefaz build() {
        return ideXmlSefaz;
    }
}
