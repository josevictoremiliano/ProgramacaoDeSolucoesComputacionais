package com.atv;

import java.util.Scanner;

public class IdadeEmDias {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite a idade em anos: ");
        int Ano = entrada.nextInt();
        
        System.out.println("Digite em messes: ");
        int Messes = entrada.nextInt();
        
        System.out.println("Digite a dias: ");
        int Dias = entrada.nextInt();
        
        int idadeEmDias = calcIdadeEmDias(Ano, Messes, Dias);
        
        System.out.println("A idade expressa em dias é: " + idadeEmDias + " dias");
        
        entrada.close();
    }
    
    public static int calcIdadeEmDias(int Ano, int Messes, int Dias){
        return (Ano * 365) + (Messes * 30) + Dias;
    }
}
