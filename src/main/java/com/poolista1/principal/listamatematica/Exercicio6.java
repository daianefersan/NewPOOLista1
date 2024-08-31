package com.poolista1.principal.listamatematica;

import java.util.Scanner;

public class Exercicio6 {
    public static void resolucao(){
        Scanner leia = new Scanner(System.in);

        int distanciakm;
        int combustivelGasto;
        int consumoMedio;

        System.out.println("Digite a distância percorrida em km: ");
        distanciakm = leia.nextInt();

        System.out.println("Digite o total de combustível gasto: ");
        combustivelGasto = leia.nextInt();

        consumoMedio = distanciakm/combustivelGasto;

        System.out.println("O consumo médio do veículo é: "+consumoMedio+"km/l");


    }

}
