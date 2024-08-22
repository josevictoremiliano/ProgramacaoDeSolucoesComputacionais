package com.atv03;

import java.util.Scanner;

public class Questao07 {
    /*
     * Faça um programa que leia 5 números e informe a soma e a média dos números.
     */

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Variável para armazenar a soma
        int soma = 0;
        // Variável para armazenar a média
        double media = 0;
        // Array para armazenar os números
        int[] numeros = new int[5];

        // Recebendo os números
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = entrada.nextInt();

            // Somando os números
            soma += numeros[i];
        }

        // Calculando a média
        media = soma / 5;

        System.out.println();
        System.out.println("A soma dos números é: " + soma);
        System.out.println("A média dos números é: " + media);

    }
}
