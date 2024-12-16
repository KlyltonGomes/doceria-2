package com.back.doceria.nfce.nfceXmlSefaz.EmitenteXml;

public class EmitenteXmlSefazBuilder {

    private EmitenteXmlSefaz emitenteXmlSefaz;

    public EmitenteXmlSefazBuilder() {
        this.emitenteXmlSefaz = new EmitenteXmlSefaz();
    }

    public EmitenteXmlSefazBuilder CNPJ(String CNPJ) {
        emitenteXmlSefaz.setCNPJ(CNPJ);
        return this;
    }
    public EmitenteXmlSefazBuilder razaoSocial(String razaoSocial){
        emitenteXmlSefaz.setRazaoSocial(razaoSocial);
        return this;
    }

    public EmitenteXmlSefazBuilder nomeFantasia(String nomeFantasia){
        emitenteXmlSefaz.setNomeFantasia(nomeFantasia);
        return this;
    }
    public EmitenteXmlSefazBuilder inscricaoEstadual(Integer inscricaoEstadual){
        emitenteXmlSefaz.setInscricaoEstadual(inscricaoEstadual);
        return this;
    }
    public EmitenteXmlSefazBuilder codAtividadeEco(Integer codAtividadeEco){
        emitenteXmlSefaz.setCodAtividadeEco(codAtividadeEco);
        return this;
    }
    public EmitenteXmlSefazBuilder codRegimeTributario(Integer codRegimeTributario){
        emitenteXmlSefaz.setCodRegimeTributario(codRegimeTributario);
        return this;
    }

    public EmitenteXmlSefaz build(){
        return emitenteXmlSefaz;
    }


}
