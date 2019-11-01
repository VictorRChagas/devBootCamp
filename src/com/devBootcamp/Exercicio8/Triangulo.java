package com.devBootcamp.Exercicio8;

public class Triangulo implements Figura {
    private String nome = "Triangulo";
    private Double lados;

    public Triangulo(Double lados) {
        this.lados = lados;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public Double getArea() {
        return lados+lados+lados;
    }
}
