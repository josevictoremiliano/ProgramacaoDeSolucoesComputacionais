package com.example;

import java.util.Scanner;

public class Matrizes01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
    
        System.out.println("Digite o número de linhas da matriz: ");
        int linhas = entrada.nextInt();

        System.out.println("Digite o número de colunas da matriz: ");
        int colunas = entrada.nextInt();

        int[][] matriz = new int[linhas][colunas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print("Digite o elemento da linha " + (i + 1) + " e coluna " + (j + 1) + ": ");
                matriz[i][j] = entrada.nextInt();
            }
        }

        System.out.println("Matriz informada: ");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }



    }
}
