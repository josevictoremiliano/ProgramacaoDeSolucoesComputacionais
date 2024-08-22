package com.atv2;

import java.util.Scanner;

public class Questao8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //  Leia a idade de 20 pessoas e exiba quantas pessoas são maiores de idade.

        int[] idades = new int[5];
        int maiores = 0;

        for (int i=0; i<5; i++){
            System.out.print("Digite a idade da " + (i+1) + "ª pessoa: ");
            idades[i] = entrada.nextInt();
        }

        for (int idade : idades) {
            if (idade >= 18) {
                maiores++;
            }
        }

        System.out.println("------------------------------------");
        System.out.println("A quantidade de pessoas maiores de idade é: " + maiores);
        
        entrada.close();

        
    }
}
