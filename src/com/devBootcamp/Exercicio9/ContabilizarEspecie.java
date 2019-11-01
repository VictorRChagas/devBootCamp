package com.devBootcamp.Exercicio9;

import java.util.ArrayList;
import java.util.List;

public class ContabilizarEspecie {

    public List<Resultado> contabilizarEspecies(List<Animal> animalList, EspeciesUtil especiesUtil){
        List<EspecieAnimal> especies = especiesUtil.classificaEspecies(animalList);

        List<Resultado> resultados = new ArrayList<>();
        for (EspecieAnimal especie : especies) {
            List<Animal> animais = especiesUtil.filtraEspecie(animalList, especie);
            Resultado resultado = new Resultado(especie, animais.size());
        }
        return resultados;
    }
}
