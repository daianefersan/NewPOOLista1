package com.poolista1.principal.listamatematica;

import java.util.Scanner;

public class Exercicio5 {
    public static void resolucao(){
        Scanner leia = new Scanner(System.in);
        //area = comprimento x largura
        //preco = precoMetroQuadrado * area

        double comprimento;
        double largura;
        double area;
        double precoMetroQuadrado;
        double preco;

        System.out.println("Escreva o comprimento: ");
        comprimento = leia.nextDouble();

        System.out.println("Escreva a largura: ");
        largura = leia.nextDouble();

        area = comprimento*largura;

        System.out.println("Escreva o preço por metro quadrado: ");
        precoMetroQuadrado = leia.nextDouble();

        preco = precoMetroQuadrado*area;

        System.out.println("Preço final: R$"+preco);


    }

}
