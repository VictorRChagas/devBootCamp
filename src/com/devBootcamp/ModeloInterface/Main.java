package com.devBootcamp.ModeloInterface;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Cavalo();
        Zoologico zoologico = new Zoologico();
        zoologico.caracteristicasAnimais(animal);

        List<Animal> listAnimal = new ArrayList<>();
        listAnimal.add(new Cavalo());
        listAnimal.add(new Gato());
        listAnimal.add(new Cachorro());
        zoologico.caracteristicasAnimais(listAnimal);

    }
}
