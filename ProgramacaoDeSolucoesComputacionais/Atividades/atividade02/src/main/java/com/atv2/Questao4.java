package com.atv2;

import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] numbers = new int[5];
        int soma = 0;

        for (int i=0; i<5; i++){
            System.out.print("Digite o " + (i+1) + "º número: ");
            numbers[i] = entrada.nextInt();
        }

        for (int number : numbers) {
            soma += number;
        }

        System.out.println("------------------------------------");
        System.out.println("A soma dos números é: " + soma);

        entrada.close();
    }
}
