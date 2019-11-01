package com.devBootcamp.Exercicio7;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private String CPF;
    private String email;
    private Integer idade;

    public Pessoa(String nome, String sobrenome, String CPF, String email, Integer idade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.CPF = CPF;
        this.email = email;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getCPF() {
        return CPF;
    }

    public String getEmail() {
        return email;
    }

    public Integer getIdade() {
        return idade;
    }
}
