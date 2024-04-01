package com;

import java.util.Scanner;

public class q1 {
    /*
     * Criar um vetor de 5 posições e preencher com os números 1, 2, 3, 4 e 5.
     */

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] Numeros = new int[5];

        // Recebendo os números
        for (int i = 0; i < Numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            Numeros[i] = entrada.nextInt();
        }

        // Exibindo os números dizendo suas posições
        System.out.println("Números digitados foram: ");
        for (int i = 0; i < Numeros.length; i++) {
            System.out.println("Posição: " + i + " o numero foi: " + Numeros[i]);
        }

        // Espaço entre os números e o fim do programa
        System.out.println();
        System.out.println("Fim do programa!");
    }
}
