package com.atv2;

import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Crie um algoritmo leia um número do usuário e exiba a sua tabuada de multiplicação.

        System.out.println("Digite um número para ver a tabuada: ");
        int num = entrada.nextInt();

        System.out.println("Tabuada de " + num + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }

        entrada.close();
    }
}
