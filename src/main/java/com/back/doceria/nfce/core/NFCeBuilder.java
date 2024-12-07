package com.back.doceria.nfce.core;

import com.back.doceria.nfce.utilidade.DataHoraEvento;
import com.back.doceria.nfce.utilidade.FormatarCPFeCNPJ;

public class NFCeBuilder {

    public static String criarXMLNFCe( String cpf,String cnpj){
        String cpfFormatado = FormatarCPFeCNPJ.removerFormatacao(cpf);
        String cnpjFormatado = FormatarCPFeCNPJ.removerFormatacao(cnpj);
        String dataHoraEvento = DataHoraEvento.gerarDataHoraEvento();

        return "<Nfe>"+
                "<cpf>" + cpfFormatado + "</cpf>" +
                "<cnpj>" + cnpjFormatado + "</cnpj>" +
                "<dhEvento>" + dataHoraEvento + "</dhEvento>" +
                "</Nfe>";
    }





}
