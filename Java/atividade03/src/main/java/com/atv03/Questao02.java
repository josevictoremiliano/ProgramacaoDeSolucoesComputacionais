package com.atv03;

import java.util.Scanner;

public class Questao02 {
    /*
     *  Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual 
     *  ao nome do usuário, mostrando uma mensagem de erro e voltando a pedir as informações.
     */

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nome = "";
        String senha = "";

        while (true) {
            System.out.print("Digite um nome de usuário: ");
            nome = entrada.nextLine();
            System.out.print("Digite uma senha: ");
            senha = entrada.nextLine();

            if (nome.equals(senha)) {
                System.out.println("\033[31m" + "Erro: a senha não pode ser igual ao nome de usuário!" + "\033[0m");
            } else {
                break;
            }
        }

        System.out.println("Usuário: " + nome);
        System.out.println("Senha: " + senha);
        System.out.println("\033[42;1;37m" + "------Senha salvada com sucesso!-------" + "\033[0m");
        // \033[42;1;37m -> Cor de fundo verde.
        entrada.close();
    }
}
