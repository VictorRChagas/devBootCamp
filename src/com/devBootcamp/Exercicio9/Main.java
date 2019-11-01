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

        ContabilizarEspecies contabilizarEspecies = new ContabilizarEspecies();
        List<Resultado> Resultados = contabilizarEspecies.contabilizarEspecies(animais, new FiltraEspecie());

        for (Resultado resultado : Resultados) {
            System.out.println(resultado.getNomeAnimal());
            System.out.println(resultado.getEspecie());
        }

    }
}
