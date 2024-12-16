package com.back.doceria.nfce.utilidade;

import com.back.doceria.nfce.nfceXmlSefaz.NfeXml;

import java.io.StringWriter;

public class GeradorXmlNfce {

    public static String gerarXml(NfeXml nfeXml) {
        try {
            jakarta.xml.bind.JAXBContext jaxbContext = jakarta.xml.bind.JAXBContext.newInstance(NfeXml.class);
            jakarta.xml.bind.Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(jakarta.xml.bind.Marshaller.JAXB_FORMATTED_OUTPUT, true);

            StringWriter writer = new StringWriter();
            marshaller.marshal(nfeXml, writer);
            return writer.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
