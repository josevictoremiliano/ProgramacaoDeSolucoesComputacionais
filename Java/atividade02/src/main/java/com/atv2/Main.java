package com.atv2;

public class Main {
    public static void main(String[] args) {
        System.out.println("----------- Bem Vindo------------");
        System.out.println("Escolha uma das questões abaixo: ");
        System.out.println("1 - Questão 1");
        System.out.println("2 - Questão 2");
        System.out.println("3 - Questão 3");
        System.out.println("4 - Questão 4");
        System.out.println("4 - Questão 7");
        

        int opcao = 1;

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