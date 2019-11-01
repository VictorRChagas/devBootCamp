package com.devBootcamp.Exercicio9;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro("Cachorro", EspecieAnimal.MAMIFEROS);
        Animal jacare = new Jacare("Jacare", EspecieAnimal.REPTEIS);

        FiltraEspecie filtraEspecie = new FiltraEspecie();
        List<Animal> animais = new ArrayList<>();
        animais.add(cachorro);
        animais.add(jacare);

        filtraEspecie.filtraEspecie(animais, EspecieAnimal.MAMIFEROS);
        List<EspecieAnimal> list = filtraEspecie.classificaEspecies(animais);

        ContabilizarEspecie contabilizarEspecie = new ContabilizarEspecie();
        contabilizarEspecie.contabilizarEspecies(animais, );




    }
}
