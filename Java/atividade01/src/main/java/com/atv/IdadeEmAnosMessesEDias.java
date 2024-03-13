package com.atv;

import java.util.Scanner;

public class IdadeEmAnosMessesEDias {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe sua idade em dias: ");
        
        int idadeEmDias = entrada.nextInt();

        int anos = idadeEmDias / 365;
        int meses = (idadeEmDias % 365) / 30;
        int dias = (idadeEmDias % 365) % 30;

        System.out.println("A idade expressa em anos, meses e dias é: " + anos + " anos, " + meses + " meses e " + dias + " dias");

        entrada.close();

    }
}
