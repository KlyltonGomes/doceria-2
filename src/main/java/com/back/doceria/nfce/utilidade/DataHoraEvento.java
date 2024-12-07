package com.back.doceria.nfce.utilidade;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DataHoraEvento {

    // Método para formatar data e hora no padrão SEFAZ (UTC)
    public static String formatarDataHoraEvento(LocalDateTime dataHora) {
        // Ajusta a data para o fuso horário UTC
        ZonedDateTime dataHoraUtc = dataHora.atZone(ZoneId.systemDefault()).withZoneSameInstant(ZoneOffset.UTC);

        // Formata a data e hora no padrão UTC (AAAA-MM-DDThh:mm:ssTZD)
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'");
        return dataHoraUtc.format(formatter);
    }

    // Método para converter uma String em LocalDateTime
    public static LocalDateTime converterParaLocalDateTime(String dataHoraStr) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'");
        return LocalDateTime.parse(dataHoraStr, formatter);
    }
    // Formato específico para o padrão NFC-e
    private static final DateTimeFormatter FORMATO_EVENTO = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssXXX");

    /**
     * Gera a data e hora atual no formato NFC-e (AAAA-MM-DDThh:mm:ssTZD).
     *
     * @return String representando a data e hora atual.
     */
    public static String gerarDataHoraEvento() {
        ZonedDateTime agora = ZonedDateTime.now(); // Obtém a data e hora atual com o fuso horário.
        return agora.format(FORMATO_EVENTO);
    }

/*    public static void main(String[] args) {
        // Exemplo de data e hora atual
        LocalDateTime dataHoraAtual = LocalDateTime.now();

        // Formata para o padrão SEFAZ
        String dataHoraFormatada = formatarDataHoraEvento(dataHoraAtual);

        // Exibe a data formatada no padrão SEFAZ (UTC)
        System.out.println("Data e hora formatada para o evento: " + dataHoraFormatada);

        // Testando a conversão reversa de volta para LocalDateTime
        LocalDateTime dataHoraConvertida = converterParaLocalDateTime(dataHoraFormatada);
        System.out.println("Data e hora convertida de volta para LocalDateTime: " + dataHoraConvertida);
    }*/
}
