package com.matriz;

import java.util.Random;

public class q1 {
    public static void main(String[] args) {
        // Inicia a matriz
        int [][] matriz = new int[2][2];
        // Inicia o random
        Random random = new Random();

        int i, j;

        // Preenche a matriz

        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                matriz[i][j] = random.nextInt(10);
            }
        }


    }
}
