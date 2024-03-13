package com.atv;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Bem Vindo, escolha uma das opções: ");
        System.out.println("1 - Medir a distância entre dois pontos");
        System.out.println("2 - Calcular de uma expressão matemática");	
        System.out.println("3 - Calcular Idade em dias");
        System.out.println("4 - Calcular idade em anos, meses e dias");
        System.out.println("5 - Calcular de media ponderada");
        System.out.println("6 - Transforme segundos em horas, minutos e segundos");
        System.out.println("7 - Calcular o custo de um carro para o consumidor");

        System.out.println("Digite o número da opção desejada: ");
        int opcao = entrada.nextInt();

        switch (opcao) {
            case 1:
                DistanciaEntreDoisPontos.main(args);
                break;
            case 2:
                CalculoDeExpressao.main(args);
                break;
            case 3:
                IdadeEmDias.main(args);
                break;
            case 4:
                IdadeEmAnosMessesEDias.main(args);
                break;
            case 5:
                MediaPonderada.main(args);
                break;
            case 6:
                LeiaSegundosETransformeEmHorasMinutosESegundos.main(args);
                break;
            case 7:
                CustoDeUmCarroParaOConsumidor.main(args);
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }
}