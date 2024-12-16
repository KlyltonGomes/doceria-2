package com.back.doceria.nfce.nfceXmlSefaz.EnderecoXml;

public class EnderecoXmlSefazBuilder {

    private EnderecoXmlSefaz enderecoXmlSefaz;

    public EnderecoXmlSefazBuilder() {
        this.enderecoXmlSefaz = new EnderecoXmlSefaz();}

    public EnderecoXmlSefazBuilder logradouro(String logradouro){
        enderecoXmlSefaz.setLogradouro(logradouro);
        return this;
    }
    public EnderecoXmlSefazBuilder numero(Integer numero){
        enderecoXmlSefaz.setNumero(numero);
        return this;
    }

    public EnderecoXmlSefazBuilder complemento(String complemento) {
        enderecoXmlSefaz.setComplemento(complemento);
        return this;
    }
    public EnderecoXmlSefazBuilder bairro(String bairro){
        enderecoXmlSefaz.setBairro(bairro);
        return this;
    }
    public EnderecoXmlSefazBuilder codigoMunicipio(String codigoMunicipio){
        enderecoXmlSefaz.setCodigoMunicipio(codigoMunicipio);
        return this;
    }
    public EnderecoXmlSefazBuilder nomeMunicipio(String nomeMunicipio){
        enderecoXmlSefaz.setNomeMunicipio(nomeMunicipio);
        return this;
    }
    public EnderecoXmlSefazBuilder unidadeFederativa(Integer unidadeFederativa){
        enderecoXmlSefaz.setUnidadeFederativa(unidadeFederativa);
        return this;
    }
    public EnderecoXmlSefazBuilder cep(Integer cep){
        enderecoXmlSefaz.setCep(cep);
        return this;
    }
    public EnderecoXmlSefazBuilder codigoPais(Integer codigoPais){
        enderecoXmlSefaz.setCodigoPais(codigoPais);
        return this;
    }
    public EnderecoXmlSefazBuilder nomePais(String nomePais){
        enderecoXmlSefaz.setNomePais(nomePais);
        return this;
    }
    public EnderecoXmlSefazBuilder telefone(String telefone){
        enderecoXmlSefaz.setTelefone(telefone);
        return this;
    }
    public EnderecoXmlSefaz build() {
        return enderecoXmlSefaz;
    }




}
