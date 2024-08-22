package com.ultilidades;

public class Alunos extends Pessoas{
    private String dataMatricula;
    private String curso;

    public void setDataMatricula(String dataMatricula){
        this.dataMatricula = dataMatricula;
    }

    public String getDataMatricula(){
        return dataMatricula;
    }

    public void setCurso(String curso){
        this.curso = curso;
    }

    public String getCurso(){
        return curso;
    }
}
