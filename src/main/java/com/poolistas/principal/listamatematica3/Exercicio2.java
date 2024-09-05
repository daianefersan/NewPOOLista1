package com.poolistas.principal.listamatematica3;

import java.util.Scanner;

public class Exercicio2 {

/* Desenvolva um programa que receba um número do usuário e escreva a
tabuada dele. */

    public static void resolucao(){
        Scanner leia = new Scanner(System.in);

        int numero;

        System.out.print("Digite um número para efetuarmos a tabuada: ");
        numero= leia.nextInt();

        for (int i = 0 ; i <=10 ; i++) {
            int resultado;
            resultado = numero * i ;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
        
        
        System.out.println("Programa encerrado");
        
        leia.close();
    }
}