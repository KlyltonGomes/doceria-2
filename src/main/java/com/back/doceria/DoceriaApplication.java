package com.back.doceria;

import com.back.doceria.nfce.nfceXmlSefaz.DestinatarioXml.DestinatarioXmlSefaz;
import com.back.doceria.nfce.nfceXmlSefaz.DestinatarioXml.DestinatarioXmlSefazBuilder;
import com.back.doceria.nfce.nfceXmlSefaz.EmitenteXml.EmitenteXmlSefaz;
import com.back.doceria.nfce.nfceXmlSefaz.EmitenteXml.EmitenteXmlSefazBuilder;
import com.back.doceria.nfce.nfceXmlSefaz.ItemXml.ItemXmlSefaz;
import com.back.doceria.nfce.nfceXmlSefaz.ItemXml.ItemXmlSefazBuilder;
import com.back.doceria.nfce.nfceXmlSefaz.NfeXml;
import com.back.doceria.nfce.nfceXmlSefaz.EnderecoXml.EnderecoXmlSefaz;
import com.back.doceria.nfce.nfceXmlSefaz.EnderecoXml.EnderecoXmlSefazBuilder;
import com.back.doceria.nfce.nfceXmlSefaz.IdentificacaoXml.IdeXmlSefaz;
import com.back.doceria.nfce.nfceXmlSefaz.IdentificacaoXml.IdeXmlSefazBuilder;
import com.back.doceria.nfce.nfceXmlSefaz.PagamentoXml.PagamentoXmlSefazBuilder;
import com.back.doceria.nfce.nfceXmlSefaz.PagamentoXml.PagametoXmlSefaz;
import com.back.doceria.nfce.utilidade.GeradorXmlNfce;
import jakarta.xml.bind.JAXBException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@SpringBootApplication
public class DoceriaApplication {

	public static void main(String[] args) throws JAXBException, jakarta.xml.bind.JAXBException, FileNotFoundException {
		System.out.println("Iniciando Sistema");
		SpringApplication.run(DoceriaApplication.class, args);
		System.out.println("Sistema em operação");

		// Criar o objeto IdeXmlSefaz
		IdeXmlSefaz ide = new IdeXmlSefazBuilder()
				.unidadeFederativa(35)
				.naturezaOperacao("Venda")
				.modeloNF(65)
				.serieNF(1)
				.numeroNF(12345)
				.datahoraEmi(LocalDateTime.now())
				.tipoNF(1)
				.destinoOperacao(1)
				.codigoMunFG(1234567)
				.tipoImp(1)
				.tipoEmis(1)
				.codigoDV(2)
				.tipoAmb(2)
				.indicadorFinal(1)
				.indicadorPres(1)
				.processoEmi(0)
				.versaoProc("1.0.0")
				.build();

		// Criar o objeto EmitenteXmlSefaz
		EmitenteXmlSefaz emitente = new EmitenteXmlSefazBuilder()
				.CNPJ("123456789012")
				.razaoSocial("Doceria da Renata")
				.nomeFantasia("Doceria Ltda")
				.inscricaoEstadual(123456789)
				.codAtividadeEco(5611201)
				.codRegimeTributario(1)
				.build();

		//criar o objeto Endereco
		EnderecoXmlSefaz endereco = new EnderecoXmlSefazBuilder()
				.logradouro("Alto alto sao joao")
				.numero(170)
				.complemento("lado A")
				.bairro("Aporanga")
				.codigoMunicipio("42")
				.nomeMunicipio("sao paulo")
				.unidadeFederativa(35)
				.cep(01007000)
				.codigoPais(1058)
				.nomePais("BRASIL")
				.telefone("11976546733")
				.build();

		//criar o objeto Destinatario
		DestinatarioXmlSefaz destinatario = new DestinatarioXmlSefazBuilder()
				.CPF("")
				.nomeDestinatario("consumidor não identificado")
				.build();


		//criar o objeto Item
		ItemXmlSefaz item = new ItemXmlSefazBuilder()
				.NumItem(1)
				.codProduto("1221")
				.descrProduto("Bolo de Chocolate")
				.codMercosul("12345678")
				.codFiscOperacao(2463)
				.unidadeMedida("UN")
				.quantComercializada(BigDecimal.valueOf(1.5))
				.valorUnitario(BigDecimal.valueOf(30.00))
				.valorTotalProd(BigDecimal.valueOf(30.00))
				.build();



		//criar o objeto Pagamento
		PagametoXmlSefaz pagamento = new PagamentoXmlSefazBuilder()
				.tipoPagamento(3)
				.totalPagamento(BigDecimal.valueOf(30.00))
				.build();




		// Configurar o container NfeXml
		NfeXml nfe = new NfeXml();
		nfe.setIde(ide);
		nfe.setEmitente(emitente);
		nfe.setEndereco(endereco);
		nfe.setDestinatario(destinatario);
		nfe.setItem(item);
		nfe.setPagamento(pagamento);
		System.out.println(GeradorXmlNfce.gerarXml(nfe));




	}
}
