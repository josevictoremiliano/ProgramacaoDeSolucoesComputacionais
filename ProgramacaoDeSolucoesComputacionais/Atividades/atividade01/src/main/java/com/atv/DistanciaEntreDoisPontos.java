package com.atv;

import java.util.Scanner;

public class DistanciaEntreDoisPontos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
           System.out.println("Digite a coordenada do primeiro ponto(x1 e y1): ");
           double x1 = entrada.nextDouble();
           double y1 = entrada.nextDouble();
           
           System.out.println("Digite a coordenada do primeiro ponto(x2 e y2): ");
           double x2 = entrada.nextDouble();
           double y2 = entrada.nextDouble();
           
           
           double distancia = calcDist(x1,y1, x2, y2);
           
           System.out.println(distancia);

           entrada.close();
    }
    
    public static double calcDist(double x1, double y1, double x2, double y2){
        return Math.pow(x2-x1,2)+ Math.pow(y2-y1,2);
    }
}
