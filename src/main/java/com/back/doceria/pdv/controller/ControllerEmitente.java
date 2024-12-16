package com.back.doceria.pdv.controller;

import com.back.doceria.pdv.entity.Emitente;
import com.back.doceria.pdv.service.ServiceEmitente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/emitente")
public class ControllerEmitente {

    @Autowired
    private ServiceEmitente serviceEmitente;

    @PostMapping
    public ResponseEntity<Emitente> criarEmitente(@RequestBody Emitente emitente){
        try{
            serviceEmitente.saveEmitente(emitente);
            return ResponseEntity.status(HttpStatus.CREATED).body(emitente);
        }
        catch (IllegalArgumentException e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }
    @GetMapping("/{id}")
    public ResponseEntity<?> findProdId(@PathVariable Long id){

        try{
            Emitente emitente = serviceEmitente.buscarEmitente(id);
            return ResponseEntity.ok(emitente);
        }catch (RuntimeException e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }



}
