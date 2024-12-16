package com.back.doceria.pdv.dto;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlRootElement(name = "Nfce")
@XmlType(propOrder = {"identificacaoNotaXml","emitenteXml","destinatarioXml","TotalXml","PagamentoXml","InformacoesAdicionaisXml"})
public class NfceXmlSefaz {

    private IdentificacaoNotaXml identificacaoNotaXml;
    private EmitenteXml emitenteXml;
    private DestinatarioXml destinatarioXml;
    private TotalXml totalXml;
    private PagamentoXml pagamentoXml;
    private InformacoesAdicionaisXml informacoesAdicionaisXml;

    @XmlElement(name = "ide")
    public IdentificacaoNotaXml getIdentificacaoNotaXml() {
        return identificacaoNotaXml;
    }

    public void setIdentificacaoNotaXml(IdentificacaoNotaXml identificacaoNotaXml) {
        this.identificacaoNotaXml = identificacaoNotaXml;
    }
    @XmlElement(name = "emi")
    public EmitenteXml getEmitenteXml() {
        return emitenteXml;
    }

    public void setEmitenteXml(EmitenteXml emitenteXml) {
        this.emitenteXml = emitenteXml;
    }
    @XmlElement(name = "dest")
    public DestinatarioXml getDestinatarioXml() {
        return destinatarioXml;
    }

    public void setDestinatarioXml(DestinatarioXml destinatarioXml) {
        this.destinatarioXml = destinatarioXml;
    }
    @XmlElement(name = "total")
    public TotalXml getTotalXml() {
        return totalXml;
    }

    public void setTotalXml(TotalXml totalXml) {
        this.totalXml = totalXml;
    }
    @XmlElement(name = "pag")
    public PagamentoXml getPagamentoXml() {
        return pagamentoXml;
    }

    public void setPagamentoXml(PagamentoXml pagamentoXml) {
        this.pagamentoXml = pagamentoXml;
    }

    @XmlElement(name = "infAdici")
    public InformacoesAdicionaisXml getInformacoesAdicionaisXml() {
        return informacoesAdicionaisXml;
    }

    public void setInformacoesAdicionaisXml(InformacoesAdicionaisXml informacoesAdicionaisXml) {
        this.informacoesAdicionaisXml = informacoesAdicionaisXml;
    }
}