package com.devBootcamp.Exercicio9;


class Gato implements Animal {

    @Override
    public EspecieAnimal getEspecie() {
        return EspecieAnimal.MAMIFEROS;
    }

    @Override
    public String getNomeAnimal() {
        return "Gato";
    }
}
