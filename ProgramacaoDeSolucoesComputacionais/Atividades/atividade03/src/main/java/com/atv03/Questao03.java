package com.atv03;

import java.util.Scanner;

public class Questao03 {
    /*
     * Faça um programa que leia e valide as seguintes informações: 
     * a. Nome: maior que 3 caracteres;
     * b. Idade: entre 0 e 150;
     * c. Salário: maior que zero;
     * d. Sexo: 'f' ou 'm';
     * e. Estado Civil: 's', 'c', 'v', 'd'
     */

    public static String Nome() {
        Scanner entrada = new Scanner(System.in);
        String nome = "";
        while (true) {
            System.out.print("Digite um nome: ");
            nome = entrada.nextLine();
            if (nome.length() > 3) {
                break;
            } else {
                System.out.println("\033[31m" + "Erro: o nome deve ter mais de 3 caracteres!" + "\033[0m");
            }
        }

        return nome;
    }

    public static int Idade() {
        Scanner entrada = new Scanner(System.in);
        int idade = 0;
        while (true) {
            System.out.print("Digite uma idade: ");
            idade = entrada.nextInt();
            if (idade >= 0 && idade <= 150) {
                break;
            } else {
                System.out.println("\033[31m" + "Erro: a idade deve estar entre 0 e 150!" + "\033[0m");
            }
        }

        return idade;
    }

    public static double Salario() {
        Scanner entrada = new Scanner(System.in);
        double salario = 0.0;
        while (true) {
            System.out.print("Digite um salário: ");
            salario = entrada.nextDouble();
            if (salario > 0) {
                break;
            } else {
                System.out.println("\033[31m" + "Erro: o salário deve ser maior que zero!" + "\033[0m");
            }
        }

        return salario;
    }

    public static char Sexo() {
        Scanner entrada = new Scanner(System.in);
        char sexo = ' ';
        while (true) {
            System.out.print("Digite um sexo (f/m): ");
            sexo = entrada.next().charAt(0);
            if (sexo == 'f' || sexo == 'm') {
                break;
            } else {
                System.out.println("\033[31m" + "Erro: o sexo deve ser 'f' ou 'm'!" + "\033[0m");
            }
        }

        return sexo;
    }

    public static String EstadoCivil() {
        Scanner entrada = new Scanner(System.in);
        char estadoCivil = ' ';
        String estadoCivilStr = "";
        while (true) {
            System.out.println("Digite um estado civil (s/c/v/d ou ?): ");
            //legenda
            System.out.println("s - Solteiro(a)");
            System.out.println("c - Casado(a)");
            System.out.println("v - Viúvo(a)");
            System.out.println("d - Divorciado(a)");
            System.out.println("? - Prefere não informar");

            estadoCivil = entrada.next().charAt(0);
            if (estadoCivil == 's' || estadoCivil == 'c' || estadoCivil == 'v' || estadoCivil == 'd' || estadoCivil == '?') {
                break;
            } else {
                System.out.println("\033[31m" + "Erro: o estado civil deve ser 's', 'c', 'v', 'd' ou '?'!" + "\033[0m");
            }
        }

        if (estadoCivil == 's') {
            estadoCivilStr = "Solteiro(a)";
        } else if (estadoCivil == 'c') {
            estadoCivilStr = "Casado(a)";
        } else if (estadoCivil == 'v') {
            estadoCivilStr = "Viúvo(a)";
        } else if (estadoCivil == 'd') {
            estadoCivilStr = "Divorciado(a)";
        } else {
            estadoCivilStr = "Prefere não informar";
        }
           

        return estadoCivilStr;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite as informações a seguir: ");

        String nome = Nome();
        int idade = Idade();
        double salario = Salario();
        char sexo = Sexo();
        String estadoCivilStr = EstadoCivil();

        System.out.println("\nInformações digitadas: ");
        System.out.println("------------------------------------------------");
        System.out.println("Nome: " + nome);
        System.out.println
        (
            "Idade: " + idade + "\n" +
            "Salário: " + salario + "\n" +
            "Sexo: " + sexo + "\n" +
            "Estado Civil: " + estadoCivilStr
        );

        System.out.println("\033[42;1;37m" + "------Informações salvas com sucesso!-------" + "\033[0m");
        // \033[42;1;37m -> Cor de fundo verde.
        entrada.close();
    }
}
