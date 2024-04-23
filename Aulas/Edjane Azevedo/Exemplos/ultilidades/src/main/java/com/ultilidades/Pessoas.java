package com.ultilidades;

public class Pessoas {
    /**
     * Declaração de atributos
     */
    protected String nome;
    protected String endereco;
    protected Sring matricula;
    protected String email;
    protected String telefone;
    protected String cpf;
    protected String rg;

    /**
     * Declaração de métodos get e set
     */

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public String getEndereco(){
        return endereco;
    }

    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    public String getMatricula(){
        return matricula;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return email;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    public String getTelefone(){
        return telefone;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public String getCpf(){
        return cpf;
    }

    public void setRg(String rg){
        this.rg = rg;
    }

    public String getRg(){
        return rg;
    }

    



}
