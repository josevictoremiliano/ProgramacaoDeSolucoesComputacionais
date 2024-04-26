package exercicio1;

public class Estudante extends Pessoa{
    private String matricula;

    public Estudante(String nome, int idade, String matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void estudar() {
        System.out.println("Estudando...");
    }
    
}
