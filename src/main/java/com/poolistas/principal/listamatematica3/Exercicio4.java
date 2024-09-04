package com.poolistas.principal.listamatematica3;

import java.util.Scanner;

public class Exercicio4 {
    public static void resolucao(){
        int numero;
        int numeroPalpite;
        
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um número: ");
        numero = leia.nextInt();

        System.out.println("Tente adivinhar o número digitado: ");
        numeroPalpite = leia.nextInt();

       do{
        System.out.println("Tente adivinhar o número digitado: ");
        numeroPalpite = leia.nextInt();

        if (numeroPalpite == numero){
            System.out.println("Parabéns! Você acertou.");

        }else if (numeroPalpite == (numero - 1) || numeroPalpite == (numero + 1)){
            System.out.println("Está quente!");

        }else{
            System.out.println("Está frio!");

        } 

       }while(numeroPalpite != numero);


    }
}
