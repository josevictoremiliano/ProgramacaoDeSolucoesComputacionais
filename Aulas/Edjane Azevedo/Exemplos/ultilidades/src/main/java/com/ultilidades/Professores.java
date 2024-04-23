package com.ultilidades;

public class Professores extends Pessoas{
    private String salario;
    private String titulacao;

    public void setSalario(String salario){
        this.salario = salario;
    }
    
    public String getSalario(){
        return salario;
    }

    public void setTitulacao(String titulacao){
        this.titulacao = titulacao;
    }

    public String getTitulacao(){
        return titulacao;
    }


}
