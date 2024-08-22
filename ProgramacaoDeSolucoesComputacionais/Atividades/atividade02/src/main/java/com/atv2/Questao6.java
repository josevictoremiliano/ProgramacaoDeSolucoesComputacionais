package com.atv2;

import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Leia a idade de 20 pessoas e exiba a soma das idades. 

        int[] idades = new int[20];
        int soma = 0;

        for (int i=0; i<20; i++){
            System.out.print("Digite a idade da " + (i+1) + "ª pessoa: ");
            idades[i] = entrada.nextInt();
        }

        for (int idade : idades) {
            soma += idade;
        }

        System.out.println("------------------------------------");
        System.out.println("A soma das idades é: " + (soma));

        entrada.close();
    }
}
