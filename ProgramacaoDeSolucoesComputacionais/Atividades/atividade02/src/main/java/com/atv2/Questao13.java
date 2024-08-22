package com.atv2;

import java.util.Scanner;

public class Questao13 {
    /*
     * Faça um algoritmo que leia 20 números e, ao final, escreva quantos estão entre 0 e 100. 
     */

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int entre0e100 = 0;

        for (int i = 0; i < 20; i++) {
            System.out.print("Digite um número: ");
            int numero = entrada.nextInt();

            if (numero >= 0 && numero <= 100) {
                entre0e100++;
            }
        }

        System.out.println("Quantidade de números entre 0 e 100: " + entre0e100);
        
    }
}
