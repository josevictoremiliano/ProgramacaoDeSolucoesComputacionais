package com.atv2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("----------- Bem Vindo------------");
        System.out.println("Escolha uma das questões abaixo: ");
        System.out.println("1 - Questão 1");
        System.out.println("2 - Questão 2");
        System.out.println("3 - Questão 3");
        System.out.println("4 - Questão 4");
        System.out.println("4 - Questão 7");
        

        int opcao;
        System.out.println("------------------------------------");
        System.out.print("Digite o número da opção desejada: ");
        opcao = entrada.nextInt();
        System.out.println("------------------------------------");


        switch (opcao) {
            case 1:
                Questao1.main(args);
                break;
            case 2:
                Questao2.main(args);
                break;
            case 3:
                Questao3.main(args);
                break;
            case 4:
                Questao4.main(args);
                break;
            case 7:
                Questao4.main(args);
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }
}