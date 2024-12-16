package com.back.doceria.nfce.nfceXmlSefaz.PagamentoXml;

import java.math.BigDecimal;

public class PagamentoXmlSefazBuilder {

    private PagametoXmlSefaz pagametoXmlSefaz;

    public PagamentoXmlSefazBuilder (){
        this.pagametoXmlSefaz = new PagametoXmlSefaz();
    }

    public PagamentoXmlSefazBuilder tipoPagamento(Integer tipoPagamento){
        pagametoXmlSefaz.setTipoPagamento(tipoPagamento);
        return this;
    }

    public PagamentoXmlSefazBuilder totalPagamento(BigDecimal totalPagamento){
        pagametoXmlSefaz.setTotalPagamento(totalPagamento);{
            return this;
        }
    }
    public PagametoXmlSefaz build(){
        return pagametoXmlSefaz;
    }





}
