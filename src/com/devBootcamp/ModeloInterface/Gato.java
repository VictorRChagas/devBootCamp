package com.devBootcamp.ModeloInterface;

public class Gato implements Animal {

    @Override
    public String corAnimal() {
        return "Rosa";
    }

    @Override
    public String somAnimal() {
        return "Miau";
    }

    @Override
    public String animal() {
        return "Gato";
    }
}
