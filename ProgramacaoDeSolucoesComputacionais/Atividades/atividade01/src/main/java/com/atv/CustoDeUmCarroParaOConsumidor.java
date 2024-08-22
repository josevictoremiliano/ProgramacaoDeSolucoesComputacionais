package com.atv;

import java.util.Scanner;

public class CustoDeUmCarroParaOConsumidor {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o custo de fábrica do carro: ");
        double custoDeFabrica = entrada.nextDouble();
        double percentualDoDistribuidor = 0.28;
        double percentualDosImpostos = 0.45;

        double custoDoDistribuidor = custoDeFabrica * percentualDoDistribuidor;
        double custoDosImpostos = custoDeFabrica * percentualDosImpostos;

        double custoTotal = custoDeFabrica + custoDoDistribuidor + custoDosImpostos;

        System.out.println("O custo total do carro para o consumidor é: " + custoTotal);

        entrada.close();
    }
}
