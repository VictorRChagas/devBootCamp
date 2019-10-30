package com.devBootcamp.exercicioModelo;

import com.devBootcamp.exercicio1.TipoTelefone;

import java.util.ArrayList;

public class Enderecos {
    private int id;
    private String rua;
    private String numero;
    private String bairro;
    private TipoEndereco tipoEndereco;

    public Enderecos(int id, String rua, String numero, String bairro, TipoEndereco tipoEndereco) {
        this.id = id;
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.tipoEndereco = tipoEndereco;
    }

    public int getId() {
        return id;
    }

    public String getRua() {
        return rua;
    }

    public String getNumero() {
        return numero;
    }

    public String getBairro() {
        return bairro;
    }

    public TipoEndereco getTipoEndereco() {
        return tipoEndereco;
    }
}
