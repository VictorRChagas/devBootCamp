package com.devBootcamp.ModeloInterface;

public class Cachorro implements Animal {

    @Override
    public String somAnimal() {
        return "Auau";
    }

    @Override
    public String corAnimal() {
        return "Black and Yellow";
    }

    @Override
    public String animal() {
        return "Cachorro";
    }
}
