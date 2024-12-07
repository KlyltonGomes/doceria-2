package com.back.doceria.nfce.integracaoSefaz;


import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.InputStream;

public class ValidadorXmlSefaz {
    // Caminho do XSD dentro da pasta resources/schemas
    public static final String CAMINHO_XSD = "schemas/tiposBasico_v3.10.xsd";
    public static boolean validarXml(String xmlContent){
        try {
            // Carregar o XSD do classpath
            InputStream xsdStream = ValidadorXmlSefaz.class.getClassLoader().getResourceAsStream(CAMINHO_XSD);

            if (xsdStream == null){
                throw new Exception("Arquivo XSD não encontrado no classpath.");
            }

            // Criar o esquema a partir do arquivo XSD
            SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema schema = factory.newSchema(new StreamSource(xsdStream));

            // Criar o validador
            Validator validator = schema.newValidator();

            // Validar o XML (usando o conteúdo XML passado como parâmetro)
            InputStream xmlStream = new java.io.ByteArrayInputStream(xmlContent.getBytes());
            validator.validate(new StreamSource(xmlStream));



            // Se não houver exceção, o XML é válido
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }










}
