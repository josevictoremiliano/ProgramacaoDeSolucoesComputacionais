package com.atv03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Import Scanner class
        Scanner input = new Scanner(System.in);

        // Variável para armazenar a escolha do usuário
        int choice;
        boolean exit = false;

        while (!exit) {
            // Mostra menu
            System.out.println("Menu:");
            System.out.println("1 - Questão 01");
            System.out.println("2 - Questão 02");
            System.out.println("3 - Questão 03");
            System.out.println("4 - Questão 04");
            System.out.println("5 - Questão 05");
            System.out.println("6 - Questão 06");
            System.out.println("7 - Questão 07");
            System.out.println("8 - Sair");
           
            System.out.print("Escolha uma opção: ");
            choice = input.nextInt();

            // Switch case para escolher a questão
            switch (choice) {
                case 1:
                    Questao01.main(args);
                    break;
                case 2:
                    Questao02.main(args);
                    break;
                case 3:
                    Questao03.main(args);
                    break;
                case 4:
                    Questao04.main(args);
                    break;
                case 5:
                    Questao05.main(args);
                    break;
                case 6:
                    Questao06.main(args);
                    break;
                case 7:
                    Questao07.main(args);
                    break;
                case 8:
                    exit = true;
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }

        }
    }
}