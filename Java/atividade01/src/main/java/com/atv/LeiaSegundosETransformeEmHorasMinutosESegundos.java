package com.atv;

import java.util.Scanner;

public class LeiaSegundosETransformeEmHorasMinutosESegundos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a quantidade de segundos: ");
        int segundos = entrada.nextInt();

        int[] tempo  = teste(segundos);
        
        System.out.println("O tempo informado em horas, minutos e segundos é: " + tempo[0] + " horas, " + tempo[1] + " minutos e " + tempo[2] + " segundos");


        entrada.close();
    }

    public static int[] teste(int segundos) {
        int horas = segundos / 3600;
        int minutos = (segundos % 3600) / 60;
        int segundosRestantes = (segundos % 3600) % 60;

        int[] tempo = {horas, minutos, segundosRestantes};

        return tempo;
    }

    

}
