package com.devBootcamp.Exercicio8;

import java.util.ArrayList;
import java.util.List;

public class FiguraGeometrica {

    private Double area;

    public FiguraGeometrica(){}

    public FiguraGeometrica(Figura figura) {
        calcularArea(figura);
    }

    public void calcularArea(List<Figura> figura){
        for (Figura figura1 : figura) {
            System.out.println("Area do " + figura1.getNome() + ": " + figura1.getArea());
        }
        System.out.println("**********************");
    }

    public void calcularArea(Figura figura){
        System.out.println("Area do " + figura.getNome() + ": " + figura.getArea());
        System.out.println("***********************");
    }
}
