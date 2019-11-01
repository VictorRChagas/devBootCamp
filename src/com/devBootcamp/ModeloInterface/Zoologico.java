package com.devBootcamp.ModeloInterface;

import java.util.ArrayList;
import java.util.List;

public class Zoologico {

    public  void caracteristicasAnimais(Animal animal){
        System.out.println("Animal: " + animal.animal());
        System.out.println("Som animal: " + animal.somAnimal());
        System.out.println("Cor animal: " + animal.corAnimal());
    }

    public  void caracteristicasAnimais(List<Animal> animal){
        for (Animal o : animal) {
            System.out.println("Animal: " + o.animal());
            System.out.println("Som animal: " + o.somAnimal());
            System.out.println("Cor animal: " + o.corAnimal());
        }
    }
}
