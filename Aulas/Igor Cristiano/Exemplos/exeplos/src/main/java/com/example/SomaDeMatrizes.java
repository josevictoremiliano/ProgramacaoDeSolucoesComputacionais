package com.example;

import java.util.Scanner;

public class SomaDeMatrizes {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int [][] matriz1 = new int[2][2];
        int [][] matriz2 = new int[2][2];
        int [][] matrizSoma = new int[2][2];

        System.out.println("Digite os elementos da primeira matriz: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Digite o elemento da linha " + (i + 1) + " e coluna " + (j + 1) + ": ");
                matriz1[i][j] = entrada.nextInt();
            }
        }

        System.out.println("Digite os elementos da segunda matriz: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Digite o elemento da linha " + (i + 1) + " e coluna " + (j + 1) + ": ");
                matriz2[i][j] = entrada.nextInt();
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrizSoma[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        System.out.println("Matriz 1: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matriz1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Matriz 2: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matriz2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Matriz soma: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrizSoma[i][j] + " ");
            }
            System.out.println();
        }

        

    }
}
