package com.poolistas.principal.listamatematica4;

import java.util.Scanner;

public class Exercicio2 {
    /*2) Agora que voce sabe o fechamento do dia, monte um código que
        identifique a compra de menor valor e a compra de maior valor*/
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

        double maior = vendas[0];
        double menor = vendas[0];
    
        for (double venda : vendas) {
            soma += venda;    
            if (venda > maior) {
                maior = venda;
            }
            if (venda < menor) {
                menor = venda;
            }
        }
    
        System.out.println("O total das vendas foi: R$" + soma);
        System.out.println("O maior valor de venda foi: R$" + maior);
        System.out.println("O menor valor de venda foi: R$" + menor);
        System.out.println("Fechamento encerrado!");
    
        leia.close();
    }
}
