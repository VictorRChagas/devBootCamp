package com.devBootcamp.Exercicio10.Cliente;

import com.devBootcamp.Exercicio10.Crud.BaseObject;

public class Cliente extends BaseObject {
    private String nome;
    private String cpf;
    private String email;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
