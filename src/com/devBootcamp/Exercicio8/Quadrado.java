package com.devBootcamp.Exercicio8;

public class Quadrado implements Figura {
    private String nome = "Quadrado";
    private Double ladoQuadrado;

    public Quadrado(Double ladoQuadrado) {
        this.ladoQuadrado = ladoQuadrado;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public Double getArea() {
        return ladoQuadrado*ladoQuadrado;
    }
}
