package com.back.doceria.pdv.service;

import com.back.doceria.pdv.entity.Nfce;
import com.back.doceria.pdv.entity.Produto;
import com.back.doceria.pdv.repository.RepositoryNfce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NfceService {

    @Autowired
    private RepositoryNfce repositoryNfce;

    public Nfce criarNfce(Nfce nfce){
        //calculo do total
        double total = nfce.getProdutos().stream()
                .mapToDouble(Produto::getPreco)
                .sum();
        nfce.setTotal(total);


        //calcular imposto
        double impostos = total * 0.1;
        nfce.setImpostos(impostos);
        return repositoryNfce.save(nfce);
    }


}
