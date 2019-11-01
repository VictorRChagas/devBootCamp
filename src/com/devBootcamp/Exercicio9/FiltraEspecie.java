package com.devBootcamp.Exercicio9;

import java.util.ArrayList;
import java.util.List;

public class FiltraEspecie implements EspeciesUtil {
    public List<EspecieAnimal> animais = new ArrayList<>();

    @Override
    public List<Animal> filtraEspecie(List<Animal> animais, EspecieAnimal especieFiltrar) {
        List<Animal> especiesFiltradas = new ArrayList<>();
        for (Animal animalFiltrado : animais) {
            if (animalFiltrado.getEspecie().equals(especieFiltrar)){
                especiesFiltradas.add(animalFiltrado);
            }
        }
        return especiesFiltradas;
    }

    @Override
    public List<EspecieAnimal> classificaEspecies(List<Animal> animais) {
        List<EspecieAnimal> especiesDistintas = new ArrayList<>();
        for (Animal animal : animais) {
           if (!especiesDistintas.contains(animal.getEspecie())) {
               especiesDistintas.add(animal.getEspecie());
           }
        }
        return especiesDistintas;
    }
}
