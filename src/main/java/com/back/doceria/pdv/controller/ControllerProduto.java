package com.back.doceria.pdv.controller;

import com.back.doceria.pdv.dto.DtoProduto;
import com.back.doceria.pdv.entity.Produto;
import com.back.doceria.pdv.service.ServiceProduto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/produtos")
public class ControllerProduto {

    @Autowired
    private ServiceProduto serviceProduto;
    //FIND PRODUCT
    @GetMapping("/{id}")
    public ResponseEntity<?> findProdId(@PathVariable Long id){

        try{
            DtoProduto dtoProduto = serviceProduto.buscarProduto(id);
            return ResponseEntity.ok(dtoProduto);
        }catch (RuntimeException e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }

    //CREATE PRODUCT
    @PostMapping
    public ResponseEntity<Produto> criarProduto(@RequestBody Produto produto){
    try {
        Produto novoProduto = serviceProduto.createProduto(produto);
        return ResponseEntity.status(HttpStatus.CREATED).body(novoProduto);

    }
    catch (IllegalArgumentException e){
        return ResponseEntity.badRequest().body(null);
        //400 dados invalidos
        }
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> removeProduto( @PathVariable Long id){
        try{
            serviceProduto.removeProduto(id);
            return ResponseEntity.noContent().build(); //204 sem conteudo
        }
        catch (RuntimeException e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build(); //404
        }
    }









}
