package com.poolistas.principal.listamatematica3;

import java.util.Scanner;

public class Exercicio1 {

    /*1) Escreva um programa que sirva como um cronômetro. O usuário deve
        digitar um numero em segundos e o programa deve contabilizar os segundos
        digitados. O programa deve receber somente números entre 1 e 59, do
        contrário ele retornar um erro e solicitar que o usuário digite um número válido.*/

    public static void resolucao(){

        Scanner leia = new Scanner(System.in);

        int numero;

        System.out.print("Digite o tempo a ser cronometrado: ");
        numero= leia.nextInt();

        if((numero>= 60) || (numero < 0)){
        System.out.print("Atenção!!! Digite um número entre 1 e 59 para iniciar seu cronômetro:  ");
        }else{
        for (int i =numero ; i >= 0 ; i--) {
        System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        System.out.println("Tempo esgotado!");
        }
        
        leia.close();
        }
    }
