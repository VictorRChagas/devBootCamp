package com.devBootcamp.Exercicio8;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(5D);
        Retangulo retangulo = new Retangulo(5D,10D);
        Triangulo triangulo = new Triangulo(5D);
        Circulo circulo = new Circulo(5D);

        System.out.println("Area quadrado: " + quadrado.getArea());
        System.out.println("Area retangulo: " + retangulo.getArea());
        System.out.println("Area triangulo: " + triangulo.getArea());
        System.out.println("Area circulo: " + circulo.getArea());
        System.out.println("**********************");
        System.out.println();

        List<Figura> figuras = new ArrayList<>();
        figuras.add(quadrado);
        figuras.add(retangulo);
        figuras.add(triangulo);
        figuras.add(circulo);

        FiguraGeometrica figuraGeometrica = new FiguraGeometrica();
        //Retornando a lista inteira
        figuraGeometrica.calcularArea(figuras);

        //Dupla assinatura, retornando apenas a figura passada
        figuraGeometrica.calcularArea(triangulo);

    }
}
