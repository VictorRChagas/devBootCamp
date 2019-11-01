package com.devBootcamp.Exercicio9;

import java.util.List;

public class Resultado {
    private EspecieAnimal especie;
    private Integer quantidade;

    public Resultado(EspecieAnimal especie, Integer quantidade) {
        this.especie = especie;
        this.quantidade = quantidade;
    }

    public EspecieAnimal getEspecie() {
        return especie;
    }

    public Integer getQuantidade() {
        return quantidade;
    }
}
