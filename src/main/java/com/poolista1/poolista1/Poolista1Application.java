package com.poolista1.poolista1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.Exercicio3;
import com.poolista1.Exercicio4;

@SpringBootApplication
public class Poolista1Application {

	public static void main(String[] args) {
		SpringApplication.run(Poolista1Application.class, args);

		Exercicio4.resolucao();
		
	}

}
