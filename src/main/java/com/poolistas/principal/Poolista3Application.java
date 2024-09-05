package com.poolistas.principal;

import org.springframework.boot.SpringApplication;

import com.poolistas.principal.listamatematica3.Exercicio01;
import com.poolistas.principal.listamatematica3.Exercicio1;
import com.poolistas.principal.listamatematica3.Exercicio4;
import com.poolistas.principal.listamatematica3.Exercicio6;
import com.poolistas.principal.listamatematica3.Exercicio7;

public class Poolista3Application {

	public static void main(String[] args) {
		SpringApplication.run(Poolista3Application.class, args);

		Exercicio6.resolucao();
		
	}

}
