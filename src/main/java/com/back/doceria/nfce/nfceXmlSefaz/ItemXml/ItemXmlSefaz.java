package com.back.doceria.nfce.nfceXmlSefaz.ItemXml;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

import java.math.BigDecimal;

@XmlRootElement(name = "det")
@XmlType(propOrder = {"numItem","codProduto","descrProduto","codMercosul","codFiscOperacao","unidadeMedida","quantComercializada","valorUnitario","valorTotalProd"})
public class ItemXmlSefaz {

    private int numItem;
    private String codProduto;
    private String descrProduto;
    private String codMercosul;
    private Integer codFiscOperacao;
    private String unidadeMedida;
    private BigDecimal quantComercializada;
    private BigDecimal valorUnitario;
    private BigDecimal valorTotalProd;

    @XmlAttribute(name = "nItem")
    public int getNumItem() {
        return numItem;
    }

    public void setNumItem(int numItem) {
        this.numItem = numItem;
    }

    @XmlElement(name = "cProd")
    public String getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(String codProduto) {
        this.codProduto = codProduto;
    }
    @XmlElement(name = "xProd")
    public String getDescrProduto() {
        return descrProduto;
    }

    public void setDescrProduto(String descrProduto) {
        this.descrProduto = descrProduto;
    }
    @XmlElement(name = "CNM")
    public String getCodMercosul() {
        return codMercosul;
    }

    public void setCodMercosul(String codMercosul) {
        this.codMercosul = codMercosul;
    }
    @XmlElement(name = "CFOP")
    public Integer getCodFiscOperacao() {
        return codFiscOperacao;
    }

    public void setCodFiscOperacao(Integer codFiscOperacao) {
        this.codFiscOperacao = codFiscOperacao;
    }
    @XmlElement(name = "uCom")
    public String getUnidadeMedida() {
        return unidadeMedida;
    }

    public void setUnidadeMedida(String unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }
    @XmlElement(name = "qCom")
    public BigDecimal getQuantComercializada() {
        return quantComercializada;
    }

    public void setQuantComercializada(BigDecimal quantComercializada) {
        this.quantComercializada = quantComercializada;
    }
    @XmlElement(name = "vUnCom")
    public BigDecimal getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(BigDecimal valorUnitario) {
        this.valorUnitario = valorUnitario;
    }
    @XmlElement(name = "vProd")
    public BigDecimal getValorTotalProd() {
        return valorTotalProd;
    }

    public void setValorTotalProd(BigDecimal valorTotalProd) {
        this.valorTotalProd = valorTotalProd;
    }
}
