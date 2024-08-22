package com.vetores;

public class q2 {
    /*
     * Gere um vetor A com 8 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho
     * e com os elementos do vetor A multiplicados por 2, ou seja: B[i] = A[i] * 2.
     */

    public static void main(String[] args) {
        int[] A = {6, 2, 3, 8, 4, 12, 27, 10};
        int[] B = new int[8];

        // Multiplicando os vetores
        for(int i = 0; i < A.length; i++) {
            B[i] = A[i] * 2;
        }

        // Mostrando os vetores
        for(int i = 0; i < A.length; i++) {
            System.out.println("O valor de A [" + i + "] é: " + A[i] + " e o valor de B [" + i + "] é: " + B[i]);
        }
    }


}
