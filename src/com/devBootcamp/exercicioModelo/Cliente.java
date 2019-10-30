package com.devBootcamp.exercicioModelo;

import com.devBootcamp.exercicio1.Endereco;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private Integer id;
    private String nome;
    private String CPF;
    private List<Enderecos> enderecos = new ArrayList<>();

    public Cliente(int id, String nome, String CPF) {
        this.id = id;
        this.nome = nome;
        this.CPF = CPF;
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCPF() {
        return CPF;
    }

    public List<Enderecos> getEnderecos() {
        return enderecos;
    }

    public void adicionarEndereco(int i, String rua, String numero, String bairro, TipoEndereco entrega){
        for (Enderecos endereco : enderecos) {
            if (endereco.getTipoEndereco() == TipoEndereco.ENTREGA) {
                System.out.println("Ja existe um endereço de entrega");
                return;
            }
        }
        setEnderecos(i,rua,numero,bairro,entrega);
    }

    public void setEnderecos(int i, String rua, String numero, String bairro, TipoEndereco entrega) {
        Enderecos endereco = new Enderecos(i,rua,numero,bairro,entrega);
        enderecos.add(endereco);
    }

    public Enderecos getEnderecoEntrega(){
        Enderecos enderecoEntrega = null;
        for (Enderecos endereco : enderecos) {
            if (endereco.getTipoEndereco() == TipoEndereco.ENTREGA) {
                enderecoEntrega = endereco;
            }
        }
        if (enderecoEntrega == null){
            System.out.println("Nenhum endereço selecionado para entrega! ");
        }
        return enderecoEntrega;
    }

}
