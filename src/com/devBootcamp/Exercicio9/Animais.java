package com.devBootcamp.Exercicio9;


public class Animais implements Animal {
    private String nomeAnimal;
    private EspecieAnimal especie;

    @Override
    public EspecieAnimal getEspecie() {
        return especie;
    }

    @Override
    public String getNomeAnimal() {
        return nomeAnimal;
    }
}
