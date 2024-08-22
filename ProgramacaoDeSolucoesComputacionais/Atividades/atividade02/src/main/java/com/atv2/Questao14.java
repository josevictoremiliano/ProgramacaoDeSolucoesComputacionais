package com.atv2;

import java.util.Scanner;

public class Questao14 {
    /*
     * Faça um algoritmo que leia 20 números e, ao final, escreva quantos estão entre 0 e 100,
     * quantos estão entre 101 e 200 e quantos são maiores de 200. 
     */

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int entre0e100 = 0;
        int entre101e200 = 0;
        int maioresDe200 = 0;

        for (int i = 0; i < 20; i++) {
            System.out.print("Digite um número: ");
            int numero = entrada.nextInt();

            if (numero >= 0 && numero <= 100) {
                entre0e100++;
            } else if (numero >= 101 && numero <= 200) {
                entre101e200++;
            } else {
                maioresDe200++;
            }
        }

        System.out.println("Quantidade de números entre 0 e 100: " + entre0e100);
        System.out.println("Quantidade de números entre 101 e 200: " + entre101e200);
        System.out.println("Quantidade de números maiores de 200: " + maioresDe200);

    }

}
