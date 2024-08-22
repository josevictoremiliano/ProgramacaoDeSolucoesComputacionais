package com.atv2;

import java.util.Scanner;

public class Questao9 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        // Leia o nome e a idade de 10 pessoas e exiba o nome da pessoa mais nova. 

        String[] nomes = new String[10];
        int[] idades = new int[10];
        int menorIdade = 0;
        String nomeMenorIdade = "";

        for (int i=0; i<10; i++){
            System.out.print("Digite o nome da " + (i+1) + "ª pessoa: ");
            nomes[i] = entrada.nextLine();
            System.out.print("Digite a idade da " + (i+1) + "ª pessoa: ");
            idades[i] = entrada.nextInt();
            entrada.nextLine();
        }

        menorIdade = idades[0];
        nomeMenorIdade = nomes[0];

        for (int i=1; i<10; i++){
            if (idades[i] < menorIdade){
                menorIdade = idades[i];
                nomeMenorIdade = nomes[i];
            }
        }

        System.out.println("------------------------------------");
        System.out.println("A pessoa mais nova é: " + nomeMenorIdade + " com " + menorIdade + " ano(s).");

        entrada.close();
    }
}
