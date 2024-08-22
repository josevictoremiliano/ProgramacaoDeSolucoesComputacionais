package com.atv2;

import java.util.Scanner;

public class Questao12 {
    /*
     * Escreva um algoritmo que leia 20 números do usuário e exiba quantos números são pares 
     */

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int pares = 0;

        for (int i = 0; i < 20; i++) {
            System.out.print("Digite um número: ");
            int numero = entrada.nextInt();

            if (numero % 2 == 0) {
                pares++;
            }
        }

        System.out.println("Quantidade de números pares: " + pares);

    }
}
