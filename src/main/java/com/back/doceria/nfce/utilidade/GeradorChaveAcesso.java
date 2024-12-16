package com.back.doceria.nfce.utilidade;

public class GeradorChaveAcesso {


    public static String gerarChaveAcesso(Integer cUF, Integer aaMM, String cnpj, Integer modelo, Integer serie,
                                          Integer numeroNFe, Integer tipoEmissao, Integer codigoNumerico) {





        // Concatenar os elementos da chave
        String chaveSemDV = cUF.toString() + aaMM + cnpj + modelo.toString() +
                serie.toString() + numeroNFe.toString() +
                tipoEmissao.toString() + codigoNumerico.toString();

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
