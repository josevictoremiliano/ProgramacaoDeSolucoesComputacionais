package com.atv;

import java.util.Scanner;

public class LeiaSegundosETransformeEmHorasMinutosESegundos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a quantidade de segundos: ");
        int segundos = entrada.nextInt();

        int horas = segundos / 3600;
        int minutos = (segundos % 3600) / 60;
        int segundosRestantes = (segundos % 3600) % 60;

        System.out.println("O valor de " + segundos + " segundos é igual a " + horas + " horas, " + minutos + " minutos e " + segundosRestantes + " segundos.");

        entrada.close();
    }
}
