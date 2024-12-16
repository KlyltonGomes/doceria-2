package com.back.doceria.nfce.nfceXmlSefaz.ItemXml;

import java.math.BigDecimal;

public class ItemXmlSefazBuilder {

    private ItemXmlSefaz itemXmlSefaz;

    public ItemXmlSefazBuilder(){
        this.itemXmlSefaz = new ItemXmlSefaz();
    }

    public ItemXmlSefazBuilder NumItem(int NumItem){
        itemXmlSefaz.setNumItem(NumItem);
        return this;
    }

    public ItemXmlSefazBuilder codProduto(String codProduto){
        itemXmlSefaz.setCodProduto(codProduto);
        return this;
    }
    public ItemXmlSefazBuilder descrProduto(String descrProduto){
        itemXmlSefaz.setDescrProduto(descrProduto);
        return this;
    }
    public ItemXmlSefazBuilder codMercosul(String codMercosul){
        itemXmlSefaz.setCodMercosul(codMercosul);
        return this;
    }
    public ItemXmlSefazBuilder codFiscOperacao(Integer codFiscOperacao){
        itemXmlSefaz.setCodFiscOperacao(codFiscOperacao);
        return this;
    }
    public ItemXmlSefazBuilder unidadeMedida(String unidadeMedida){
        itemXmlSefaz.setUnidadeMedida(unidadeMedida);
        return this;
    }
    public ItemXmlSefazBuilder quantComercializada(BigDecimal quantComercializada){
        itemXmlSefaz.setQuantComercializada(quantComercializada);
        return this;
    }
    public ItemXmlSefazBuilder valorUnitario(BigDecimal valorUnitario){
        itemXmlSefaz.setValorUnitario(valorUnitario);
        return this;
    }
    public ItemXmlSefazBuilder valorTotalProd(BigDecimal valorTotalProd){
        itemXmlSefaz.setValorTotalProd(valorTotalProd);
        return this;
    }
    public ItemXmlSefaz build(){
        return itemXmlSefaz;
    }



}
