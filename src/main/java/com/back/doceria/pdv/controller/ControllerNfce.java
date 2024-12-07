package com.back.doceria.pdv.controller;

import com.back.doceria.pdv.entity.Nfce;
import com.back.doceria.pdv.service.NfceService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/nfce")
public class ControllerNfce {

    private NfceService nfceService;

    @PostMapping
    public ResponseEntity<Nfce> criarNfce(@RequestBody Nfce nfce){

        Nfce novaNfce = nfceService.criarNfce(nfce);
        return ResponseEntity.status(HttpStatus.CREATED).body(novaNfce);

    }









}
