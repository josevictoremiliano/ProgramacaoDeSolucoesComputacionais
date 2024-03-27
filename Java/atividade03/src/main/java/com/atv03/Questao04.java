package com.atv03;

public class Questao04 {
    /*
     * Supondo que a população de um país A seja da ordem de 80000 habitantes com uma taxa anual de crescimento de 3% e que
     * a população de B seja 200000 habitantes com uma taxa de crescimento de 1.5%. Faça um programa que calcule e escreva
     * o número de anos necessários para que a população do país A ultrapasse ou iguale a população do país B, mantidas as taxas de crescimento.
     */

    public static void main(String[] args) {
        int populacaoA = 80000;
        int populacaoB = 200000;
        double crescimentoA = 0.03;
        double crescimentoB = 0.015;
        int anos = 0;

        while (populacaoA < populacaoB) {
            populacaoA += populacaoA * crescimentoA;
            populacaoB += populacaoB * crescimentoB;
            anos++;
        }

        System.out.println("Serão necessários " + anos + " anos para que a população do país A ultrapasse ou iguale a população do país B.");

    }


}
