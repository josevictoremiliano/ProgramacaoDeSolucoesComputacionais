package com.atv2;

import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String[] names = new String[5];

        for (int i=0; i<5; i++){
            System.out.println("Digite um nome: ");
            names[i] = entrada.nextLine();
        }
        
        for (String name : names) {
            System.out.println(name);
        }
    }
}
