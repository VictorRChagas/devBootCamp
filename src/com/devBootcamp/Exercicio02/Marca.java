package com.devBootcamp.Exercicio02;

import java.time.LocalDate;

public class Marca {
    private String nome;
    private LocalDate dataFabricacao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(LocalDate dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public void dadosMarca(){
        System.out.println("Marca do Veiculo: ");
        System.out.println("Marca: " + nome);
        System.out.println("Data de Fabricação: " + dataFabricacao);
        System.out.println("--------------------------------");
        System.out.println();
    }
}
