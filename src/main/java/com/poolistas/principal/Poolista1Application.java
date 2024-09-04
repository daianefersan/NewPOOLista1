package com.poolistas.principal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.poolistas.principal.listamatematica1.Exercicio8;

@SpringBootApplication
public class Poolista1Application {

	public static void main(String[] args) {
		SpringApplication.run(Poolista1Application.class, args);

		Exercicio8.resolucao();
		
	}

}
