package com.devBootcamp.calculadoraExemplo;

import java.util.ArrayList;
import java.util.List;

public class CalcularoraImpostos {

    public Double calcularImposto(Imposto imposto){
        return imposto.calcularImposto();
    }

    public Double calcularImposto(List<Imposto> imposto){
        return imposto.stream()
                .mapToDouble(Imposto::calcularImposto).sum();
        }

}
