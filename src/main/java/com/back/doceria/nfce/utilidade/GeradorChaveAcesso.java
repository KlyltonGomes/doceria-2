package com.back.doceria.nfce.utilidade;

public class GeradorChaveAcesso {

    public static String gerarChaveAcesso(String cUF, String aaMM, String cnpj, String modelo, String serie,
                                          String numeroNFe, String tipoEmissao, String codigoNumerico) {
        // Concatenar os elementos da chave
        String chaveSemDV = cUF + aaMM + cnpj + modelo + serie + numeroNFe + tipoEmissao + codigoNumerico;

        // Calcular o dígito verificador
        int dv = calcularDigitoVerificador(chaveSemDV);

        // Retornar a chave de acesso completa
        return chaveSemDV + dv;
    }

    private static int calcularDigitoVerificador(String chaveSemDV) {
        int peso = 2;
        int soma = 0;

        // Percorrer a chave de trás para frente
        for (int i = chaveSemDV.length() - 1; i >= 0; i--) {
            int num = Character.getNumericValue(chaveSemDV.charAt(i));
            soma += num * peso;

            // Ajustar peso
            peso = (peso < 9) ? peso + 1 : 2;
        }

        // Calcular o módulo 11
        int resto = soma % 11;
        int dv = (resto == 0 || resto == 1) ? 0 : 11 - resto;

        return dv;
    }



}