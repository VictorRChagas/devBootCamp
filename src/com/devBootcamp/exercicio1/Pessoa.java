package com.devBootcamp.exercicio1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private int CPF;
    private String email;
    private LocalDate dataNascimento;
    private List<Endereco> enderecos = new ArrayList<Endereco>();
    private List<Telefone> telefones = new ArrayList<Telefone>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void dadosPessoa(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Sobrenome: " + this.sobrenome);
        System.out.println("CPF: " + this.CPF);
        System.out.println("Email: " + this.email);
        System.out.println("Data de Nascimento: " + dataNascimento);
        Endereco Enderecos;
        TipoTelefone Telefones;
        for (Endereco endereco : enderecos) {
            System.out.println("Endereços: " + endereco.getRua() + ", " + endereco.getNumeroEndereco() + ", " + endereco.getBairro());
            System.out.println("--------------------------------------------------");
        }

        for (Telefone telefone : telefones) {
            System.out.println("Telefones: " + telefone.getNumeroTelefone() + " Tipo: " + telefone.getTipoTelefone()
            );
            System.out.println("--------------------------------------------------");
        }
    }

    public void adicionarEnderecos(String rua, int numeroEndereco , String bairro){
        Endereco endereco = new Endereco(rua, numeroEndereco, bairro);
        enderecos.add(endereco);
    }

    public void adicionarTelefones(String numeroTelefone, TipoTelefone tipoTelefone){
        Telefone telefone = new Telefone(numeroTelefone, tipoTelefone);
        telefones.add(telefone);
    }


}
