package com.back.doceria;

import com.back.doceria.nfce.integracaoSefaz.ValidadorXmlSefaz;
import com.back.doceria.nfce.utilidade.GeradorXmlNfce;
import com.back.doceria.pdv.dto.EmitenteXml;
import com.back.doceria.pdv.dto.NfceXml;
import com.back.doceria.pdv.dto.ProdutoXml;
import jakarta.xml.bind.JAXBException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.*;
import java.util.List;

@SpringBootApplication
public class DoceriaApplication {

	public static void main(String[] args) throws JAXBException, jakarta.xml.bind.JAXBException, FileNotFoundException {
		System.out.println("Iniciando Sistema");
		SpringApplication.run(DoceriaApplication.class, args);
		System.out.println("Iniciando Sistema");


	}
}
