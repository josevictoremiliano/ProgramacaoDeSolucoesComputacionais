package com.atv03;

import java.util.Scanner;

public class Questao01 {
    /* 
        * Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o valor seja inválido 
        * e continue pedindo até que o usuário informe um valor válido. 
    */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota = -1;

        while (nota < 0 || nota > 10) {
            System.out.print("Digite uma nota entre 0 e 10: ");
            nota = entrada.nextDouble();
            if (nota < 0 || nota > 10) {
                System.out.println("Nota inválida!");
            }
        }

        System.out.println("Nota válida: " + nota);
        entrada.close();
        
    }
    
}
