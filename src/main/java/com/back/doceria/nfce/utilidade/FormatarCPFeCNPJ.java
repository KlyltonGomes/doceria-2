package com.back.doceria.nfce.utilidade;




public class FormatarCPFeCNPJ {

    private FormatarCPFeCNPJ() {
        throw new UnsupportedOperationException("Classe FormatarCPFeCNPJ nao pode ser instanciada");
    }


    //remover pontos e tracos do cpf e cnpj
    public static String removerFormatacao(String valor) {
        return valor.replaceAll("[.\\-/]", "");
    }

    public static String addFormatacao(String valor) {

        try{
            if (valor.length() == 11){
                return valor.replaceAll("(\\d{3})(\\d{3})(\\d{3})(\\d{2})", "$1.$2.$3-$4");
            }
            if (valor.length() == 14){
                return valor.replaceAll("(\\d{2})(\\d{3})(\\d{3})(\\d{4})(\\d{2})", "$1$2$3$4$5");


            }else {
                System.out.print("cpf 11 digito ou cnpj 14 digito");

            }

        }catch (IllegalArgumentException e){

        }


        return valor;
    }


    //valor.replaceAll("(\\d{2})(\\d{3})(\\d{3})(\\d{4})(\\d{2})", "$1.$2.$3/$4-$5");
    //return valor.replaceAll("(\\d{3})(\\d{3})(\\d{3})(\\d{2})", "$1.$2.$3-$4");

}



