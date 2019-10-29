package com.devBootcamp.exercicio1;

import java.util.ArrayList;

public class Endereco {
    private String rua;
    private int numeroEndereco;
    private String bairro;

    public Endereco(String rua, int numeroEndereco, String bairro) {
        this.rua = rua;
        this.numeroEndereco = numeroEndereco;
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public int getNumeroEndereco() {
        return numeroEndereco;
    }

    public String getBairro() {
        return bairro;
    }

}
