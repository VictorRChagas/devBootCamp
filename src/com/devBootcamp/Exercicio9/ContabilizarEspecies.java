package com.devBootcamp.Exercicio9;

import java.util.ArrayList;
import java.util.List;

public class ContabilizarEspecies {
    public List<Resultado> contabilizarEspecies(List<Animal> animais, EspeciesUtil especiesUtil){
        List<Resultado> resultados = new ArrayList<Resultado>();
        List<EspecieAnimal> especies = especiesUtil.classificaEspecies(animais);
        for (EspecieAnimal especie : especies) {
            List<Animal> listaAnimais = especiesUtil.filtraEspecie(animais,especie);
            Resultado resultado = new Resultado(especie,listaAnimais.size());
            resultados.add(resultado);
        }
        return resultados;
    }
}
