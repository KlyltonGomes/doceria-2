package com.back.doceria.nfce.utilidade;

public class GeradorQrCode {

    // Função que cria a URL do QR Code
    public static String gerarQrCode(String chaveAcesso) {
        String baseUrl = "https://www.sefaz.fazenda.sp.gov.br/NFCEqrcode/p/";

        // Montar a URL com o parâmetro chave de acesso
        String url = baseUrl + chaveAcesso;
        return url;
    }

    // Função que cria a URL para consulta por chave
    public static String gerarUrlChave(String chaveAcesso) {
        return "https://www.sefaz.fazenda.sp.gov.br/nfceportal/consulta.aspx?chave=" + chaveAcesso;
    }
}
