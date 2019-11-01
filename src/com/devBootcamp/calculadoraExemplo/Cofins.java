package com.devBootcamp.calculadoraExemplo;

public class Cofins implements Imposto {

    private Double valorBase;

    public Cofins(Double valorBase) {
        this.valorBase = valorBase;
    }

    @Override
    public Double calcularImposto() {
        return valorBase * 0.30;
    }
}
