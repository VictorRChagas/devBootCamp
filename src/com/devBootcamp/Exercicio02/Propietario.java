package com.devBootcamp.Exercicio02;

import java.time.LocalDate;

public class Propietario {
    private String nome;
    private String CPF;
    private String RG;
    private LocalDate dataNascimento;
    private String endereco;

    public Propietario(String nome, String CPF, String RG) {
        this.nome = nome;
        this.CPF = CPF;
        this.RG = RG;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void dadosPropietario(){
        System.out.println("Dados Proprietario do Veiculo: ");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + CPF);
        System.out.println("RG: " + RG);
        System.out.println("--------------------------------");
        System.out.println();
    }
}
