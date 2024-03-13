package com.atv;

import java.util.Scanner;

public class MediaPonderada {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Deseja informar os pesos das notas? (S/N)");
        String resposta = entrada.nextLine();

        if (resposta.equalsIgnoreCase("S")) {
            System.out.println("Informe a primeira nota: ");
            double nota1 = entrada.nextDouble();
            System.out.println("Informe o peso da primeira nota: ");
            double peso1 = entrada.nextDouble();

            System.out.println("Informe a segunda nota: ");
            double nota2 = entrada.nextDouble();
            System.out.println("Informe o peso da segunda nota: ");
            double peso2 = entrada.nextDouble();

            System.out.println("Informe a terceira nota: ");
            double nota3 = entrada.nextDouble();
            System.out.println("Informe o peso da terceira nota: ");
            double peso3 = entrada.nextDouble();

            double mediaPonderada = ((nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3)) / (peso1 + peso2 + peso3);

            System.out.println("A média ponderada é: " + mediaPonderada);
        } else {
            System.out.println("Ok, Vou processegir usando os pesos padrões (2, 3 e 5)");
            System.out.println("Informe a primeira nota: ");
            double nota1 = entrada.nextDouble();

            System.out.println("Informe a segunda nota: ");
            double nota2 = entrada.nextDouble();

            System.out.println("Informe a terceira nota: ");
            double nota3 = entrada.nextDouble();

            double mediaPonderada = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / (2 + 3 + 5);

            System.out.println("A média ponderada é: " + mediaPonderada);
        }

        
        entrada.close();
    }

}
