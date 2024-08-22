package com.atv03;

import java.util.Scanner;

public class Questao06 {
    /*
     * Faça um programa que leia 5 números e informe o maior número.
     */

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Variável para armazenar o maior número
        int maior = 0;
        // Array para armazenar os números
        int[] numeros = new int[5];

        // Recebendo os números
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = entrada.nextInt();

            // Verificando se é o maior número
            if (i == 0) {
                // Inicializando o maior número
                maior = numeros[i];
            } 
            // Verificando se o número é igual ao maior
                else {
                if (numeros[i] > maior) {
                    // Atualizando o maior número
                    maior = numeros[i];
                }
            }
        }

        System.out.println();
        System.out.println("O maior número é: " + maior);

    }
}
