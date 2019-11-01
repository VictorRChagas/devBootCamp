package com.devBootcamp.Exercicio9;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro();
        Animal jacare = new Jacare();

        FiltraEspecie filtraEspecie = new FiltraEspecie();
        List<Animal> animais = new ArrayList<>();
        animais.add(cachorro);
        animais.add(jacare);

        List<EspecieAnimal> list = filtraEspecie.classificaEspecies(animais);

        Resultado resultado = new Resultado(EspecieAnimal.AVES,20);

        filtraEspecie.filtraEspecie(animais, EspecieAnimal.MAMIFEROS);
        List<EspecieAnimal> listClassificado = filtraEspecie.classificaEspecies(animais);
        for (EspecieAnimal especieAnimal : listClassificado) {
            System.out.println(especieAnimal);
        }
        System.out.println(filtraEspecie.classificaEspecies(animais));

    }
}
