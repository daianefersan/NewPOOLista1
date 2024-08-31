package com.poolista1.principal.listamatematica;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {
    public static void resolucao() {
        Scanner leia = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        String nome;
        String sobrenome;

        System.out.println("Escreva o seu nome: ");
        nome = leia.nextLine();

        System.out.println("Digite seu sobrenome: ");
        sobrenome = leia.nextLine();
       
        System.out.println("Olá "+nome+" "+sobrenome+"!");


    }
}
