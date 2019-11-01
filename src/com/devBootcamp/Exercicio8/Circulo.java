package com.devBootcamp.Exercicio8;

public class Circulo implements Figura {
    private String nome = "Circulo";
    private Double pi = 3.1416;
    private Double raio;

    public Circulo(Double raio) {
        this.raio = raio;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public Double getArea() {
        return pi*(raio *raio);
    }
}
