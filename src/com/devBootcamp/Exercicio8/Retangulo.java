package com.devBootcamp.Exercicio8;

public class Retangulo implements Figura {
    private String nome = "Retangulo";
    private Double base;
    private Double altura;

    public Retangulo(Double base, Double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public Double getArea() {
        return base*altura;
    }
}
