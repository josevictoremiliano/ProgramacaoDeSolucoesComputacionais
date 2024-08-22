package exercicio1;



public class Main {
    /*
     * Exercício 1: Herança e Encapsulamento
     * Enunciado: Crie duas classes, Pessoa e Estudante, que demonstrem o conceito de herança e encapsulamento. 
     * A classe Pessoa deve ter atributos nome e idade, além dos métodos getters e setters para esses atributos. 
     * A classe Estudante deve estender Pessoa e adicionar um atributo matricula e um método estudar(). 
     */
    public static void main(String[] args) {
        Estudante estudante = new Estudante("João", 20, "123456");
        System.out.println("Nome: " + estudante.getNome());
        System.out.println("Idade: " + estudante.getIdade());
        System.out.println("Matrícula: " + estudante.getMatricula());
        estudante.estudar();

        estudante.setNome("Maria");
        estudante.setIdade(21);
        estudante.setMatricula("654321");

        System.out.println("Nome: " + estudante.getNome());
        System.out.println("Idade: " + estudante.getIdade());
        System.out.println("Matrícula: " + estudante.getMatricula());


    }
}
