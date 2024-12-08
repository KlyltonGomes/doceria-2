package com.back.doceria.nfce.utilidade;

import com.back.doceria.pdv.dto.NfceXml;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Marshaller;

import java.io.StringWriter;

public class GeradorXmlNfce {

    public static String gerarXml(NfceXml nfceXml) throws jakarta.xml.bind.JAXBException {
        // Gerar a URL do QR Code (Consulta NFC-e)
        String qrCodeUrl = GeradorQrCode.gerarQrCode(nfceXml.getChaveAcesso());
        nfceXml.setQrCode(qrCodeUrl);

        // Gerar a URL para consulta por chave
        String urlChave = GeradorQrCode.gerarUrlChave(nfceXml.getChaveAcesso());
        nfceXml.setUrlChave(urlChave);

        // Ajuste para usar NfceXml.class em vez de Nfce.class
        JAXBContext context = JAXBContext.newInstance(NfceXml.class);  // Aqui usamos NfceXml, não Nfce

        // Criar o marshaller para o contexto de NfceXml
        Marshaller marshaller = context.createMarshaller();  // Não é necessário o cast

        // Definir a formatação do XML
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        // Gerar o XML em uma string
        StringWriter writer = new StringWriter();
        marshaller.marshal(nfceXml, writer);  // Marsha a instância de NfceXml
        return writer.toString();
    }
}
