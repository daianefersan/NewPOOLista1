package com.poolistas.principal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.poolistas.principal.listamatematica4.Exercicio1;
import com.poolistas.principal.listamatematica4.Exercicio2;
import com.poolistas.principal.listamatematica4.Exercicio3;
import com.poolistas.principal.listamatematica4.Exercicio4;
import com.poolistas.principal.listamatematica4.Exercicio5;

@SpringBootApplication
public class Poolista4Application {


	public static void main(String[] args) {
		SpringApplication.run(Poolista4Application.class, args);

		Exercicio5.resolucao();
		
	}

}