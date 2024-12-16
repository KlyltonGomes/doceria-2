package com.back.doceria.nfce.nfceXmlSefaz;

import com.back.doceria.nfce.nfceXmlSefaz.DestinatarioXml.DestinatarioXmlSefaz;
import com.back.doceria.nfce.nfceXmlSefaz.EmitenteXml.EmitenteXmlSefaz;
import com.back.doceria.nfce.nfceXmlSefaz.EnderecoXml.EnderecoXmlSefaz;
import com.back.doceria.nfce.nfceXmlSefaz.IdentificacaoXml.IdeXmlSefaz;
import com.back.doceria.nfce.nfceXmlSefaz.ItemXml.ItemXmlSefaz;
import com.back.doceria.nfce.nfceXmlSefaz.PagamentoXml.PagametoXmlSefaz;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlRootElement(name = "Nfe")
@XmlType(propOrder = {"ide", "emitente","endereco","destinatario","item","pagamento"})
public class NfeXml {

    private IdeXmlSefaz ide;
    private EmitenteXmlSefaz emitente;
    private EnderecoXmlSefaz endereco;
    private DestinatarioXmlSefaz destinatario;
    private ItemXmlSefaz item;
    private PagametoXmlSefaz pagamento;

    @XmlElement(name = "ide")
    public IdeXmlSefaz getIde() {
        return ide;
    }

    public void setIde(IdeXmlSefaz ide) {
        this.ide = ide;
    }

    @XmlElement(name = "emit")
    public EmitenteXmlSefaz getEmitente() {
        return emitente;
    }

    public void setEmitente(EmitenteXmlSefaz emitente) {
        this.emitente = emitente;
    }
    @XmlElement(name = "enderEmit")
    public EnderecoXmlSefaz getEndereco() {
        return endereco;
    }

    public void setEndereco(EnderecoXmlSefaz endereco) {
        this.endereco = endereco;
    }
    @XmlElement(name = "dest")
    public DestinatarioXmlSefaz getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(DestinatarioXmlSefaz destinatario) {
        this.destinatario = destinatario;
    }
    @XmlElement(name = "det")
    public ItemXmlSefaz getItem() {
        return item;
    }

    public void setItem(ItemXmlSefaz item) {
        this.item = item;
    }
    @XmlElement(name = "pag")
    public PagametoXmlSefaz getPagamento() {
        return pagamento;
    }

    public void setPagamento(PagametoXmlSefaz pagamento) {
        this.pagamento = pagamento;
    }
}
