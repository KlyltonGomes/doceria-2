/*
package com.back.doceria.pdv.service;

import com.back.doceria.pdv.entity.Produto;
import com.back.doceria.pdv.repository.RepositoryProduto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceProduto {



    @Autowired
    private RepositoryProduto repositoryProduto;

    private Produto produto;
    //FIND
    public DtoProduto buscarProduto(Long id) {
        Produto produto = repositoryProduto.findById(id)
                .orElseThrow(() -> new RuntimeException("Produto não encontrado com o ID: " + id));

        return new DtoProduto(produto.getNome(),produto.getPreco());
    }
    //CREATE
    public Produto createProduto(Produto produto){ return repositoryProduto.save(produto); }

    //REMOVE
    public void removeProduto(Long id){ repositoryProduto.deleteById(id); }

}*/


