package com.atv2;

import java.util.Scanner;

public class Questao11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = entrada.nextInt();
        }

        System.out.println("Os numeros digitados maiores que 8 foram:");
        for (int i = 0; i < 10; i++) {
            if (numeros[i] > 8) {
                System.out.println(numeros[i]);
            }
        }

        entrada.close();
    }
}
