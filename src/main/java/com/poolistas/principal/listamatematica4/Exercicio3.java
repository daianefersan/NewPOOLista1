package com.poolistas.principal.listamatematica4;

import java.util.Scanner;

public class Exercicio3 {
    /*3) Ainda utilizando o exercício do mercado, calcule o ticket médio de
        vendas do dia */
    public static void resolucao() {

        int nVendas;
        double soma = 0;
        Scanner leia = new Scanner(System.in);

        System.out.println("Bem-vindo ao sistema de vendas!");

        System.out.println("Por favor digite quantas vendas foram realizadas hoje: ");
        nVendas = leia.nextInt();

        double[] vendas = new double[nVendas];

        for (int i = 0 ; i < nVendas ; i++) {
            System.out.print("Digite o valor da " + (i+1) + "° venda" + ": ");
            vendas[i] = leia.nextDouble();
            
        }
        for (double venda : vendas) {
            soma += venda;    
        }
        System.out.print("\nO total das vendas foi: R$" + soma+ "\n\n");

        double ticketMedio = (soma/nVendas);

        System.out.println("O ticket médio de vendas do dia foi: R$"+ticketMedio);

        System.out.println("Fechamento encerrado!");
    }
}
