package com.devBootcamp.calculadoraExemplo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CalcularoraImpostos calcularoraImpostos = new CalcularoraImpostos();
        Double valorBaseCalculo = 100D;

        var Icms = new Icms(valorBaseCalculo);
        var Cofins = new Cofins(valorBaseCalculo);
        var Ipi = new Ipi(valorBaseCalculo);
        var Pis = new Pis(valorBaseCalculo);

        Double valorICMS = calcularoraImpostos.calcularImposto(Icms);
        Double valorCofins = calcularoraImpostos.calcularImposto(Cofins);
        Double valorIpi = calcularoraImpostos.calcularImposto(Ipi);
        Double valorPis = calcularoraImpostos.calcularImposto(Pis);

        List<Imposto> impostos = new ArrayList<>();
        impostos.add(Icms);
        impostos.add(Cofins);
        impostos.add(Ipi);
        impostos.add(Pis);

        System.out.println("Valor ICMS: " + valorICMS);
        System.out.println("Valor PIS: " + valorPis);
        System.out.println("Valor COFINS: " + valorCofins);
        System.out.println("Valor IPI: " + valorIpi );

    }
}
