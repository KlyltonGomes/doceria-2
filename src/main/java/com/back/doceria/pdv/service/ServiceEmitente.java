package com.back.doceria.pdv.service;

import com.back.doceria.pdv.dto.DtoProduto;
import com.back.doceria.pdv.entity.Emitente;
import com.back.doceria.pdv.entity.Produto;
import com.back.doceria.pdv.repository.RepositoryEmitente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceEmitente {
    @Autowired
    private RepositoryEmitente repositoryEmitente;

    public Emitente saveEmitente(Emitente emitente){
         return repositoryEmitente.save(emitente);
    }
    public Emitente buscarEmitente(Long id) {
        return  repositoryEmitente.findById(id)
                .orElseThrow(() -> new RuntimeException("Emitente não encontrado com o ID: " + id));


    }







}
