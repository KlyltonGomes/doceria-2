package com.back.doceria;

import com.back.doceria.nfce.core.NFCeBuilder;
import com.back.doceria.nfce.utilidade.FormatarCPFeCNPJ;
import com.back.doceria.pdv.entity.Produto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class DoceriaApplication {

	public static void main(String[] args) {
		System.out.println("Iniciando Sistema");
		SpringApplication.run(DoceriaApplication.class, args);
		System.out.println("Lets'Go!!!");




	}

}
