package com.atv2;

import java.util.Scanner;

public class Questao15 {
    /*
     * Escreva um algoritmo que leia uma sequência de números do usuário e realize a soma desses números. 
     * Encerre a execução quando um número negativo for digitado
     */

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int soma = 0;
        int numero = 0;

        while (numero >= 0) {
            System.out.print("Digite um número: ");
            numero = entrada.nextInt();

            if (numero >= 0) {
                soma += numero;
            }
        }

        if(soma == 0){
            System.out.println("Nenhum número foi digitado ou todos os números digitados foram negativos.");
        } else {
            System.out.println("Soma dos números: " + soma);
            System.out.println();
        }
    }

}
