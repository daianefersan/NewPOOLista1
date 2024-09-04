package com.poolistas.principal.listamatematica3;

import java.util.Scanner;

public class Exercicio7 {
    public static void resolucao(){
        /*7) Aproveitando o exercício anterior, escreva um programa que consiga
            construir um retângulo. O usuário deve informar a largura e a altura em
            asteriscos*/
            int largura;
            int altura;
            
            System.out.println("Altura: ");
            Scanner leia = new Scanner(System.in);
            altura = leia.nextInt();
    
            System.out.println("Largura: ");
            largura = leia.nextInt();
            
            for (int j = 0; j < altura; j++) {
                for (int i = 0; i < largura; i++) {
                    System.out.print("*");
                }  
                System.out.println();
            }


        }

}
