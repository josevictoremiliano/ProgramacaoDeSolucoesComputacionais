package com.atv;

import java.util.Scanner;

public class CalculoDeExpressao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o valor de A: ");
        int A = entrada.nextInt();
                
        System.out.print("Digite o valor de B: ");
        int B = entrada.nextInt();
        
        System.out.print("Digite o valor de C: ");
        int C = entrada.nextInt();
        
        //Calculo de R e S Conforme a expressão
        int R = A + B;
        int S = B + C;
        
        double D  = (Math.pow(R+S,2)/2.0);
        
        System.out.println("O resultado da expressão é: " + D);
                
        entrada.close();
    }
}
