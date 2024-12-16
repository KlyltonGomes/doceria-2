package com.back.doceria.nfce.nfceXmlSefaz.DestinatarioXml;

public class DestinatarioXmlSefazBuilder {

    private DestinatarioXmlSefaz destinatarioXmlSefaz;

    public DestinatarioXmlSefazBuilder(){
        this.destinatarioXmlSefaz = new DestinatarioXmlSefaz();
    }

    public DestinatarioXmlSefazBuilder CPF(String CPF){
        destinatarioXmlSefaz.setCPF(CPF);
        return this;
    }
    public DestinatarioXmlSefazBuilder nomeDestinatario(String nomeDestinatario){
        destinatarioXmlSefaz.setNomeDestinatario(nomeDestinatario);
        return this;
    }


    public DestinatarioXmlSefaz build() {
        return destinatarioXmlSefaz;
    }
}
