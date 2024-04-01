package com.vetores;

import java.util.Scanner;

public class q1 {
    /*
     * Criar um vetor de 5 posições e preencher com os números 1, 2, 3, 4 e 5.
     */

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] Numeros = new int[5];
        int[] Numeros2 = new int[5];

        // Recebendo os números do vetor 1
        for (int i = 0; i < Numeros.length; i++) {
            // Recebendo os números
            System.out.print("Digite o " + (i + 1) + "º número do Vetor 1: ");
            Numeros[i] = entrada.nextInt();
        }

        System.out.println("Agora vamos preencher o Vetor 2");
        // Recebendo os números do vetor 2
        for (int i = 0; i < Numeros.length; i++) {
            // Recebendo os números
            System.out.print("Digite o " + (i + 1) + "º número do Vetor 2: ");
            Numeros2[i] = entrada.nextInt();
        }

        // Somando os vetores das posições 
        for (int i = 0; i < Numeros.length; i++) {
            // Somando os vetores
            System.out.println("A soma de " + Numeros[i] +" + " + Numeros2[i] + " na posição " + i + " é: " + (Numeros[i] + Numeros2[i]));
        }

    

        // Espaço entre os números e o fim do programa
        System.out.println();
        System.out.println("Fim do programa!");
    }
}
