package com.devBootcamp.Exercicio8;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Figura quadrado = new Quadrado(5D);
        Figura retangulo = new Retangulo(5D,10D);
        Figura triangulo = new Triangulo(5D);
        Figura circulo = new Circulo(5D);

        List<Figura> figuras = List.of(quadrado,retangulo,triangulo,circulo);

        //Metodo que calcula direto do construtor, alterando apenas o parametro
        FiguraGeometrica figuraGeometrica = new FiguraGeometrica(triangulo);

        //Retornando a lista inteira
        figuraGeometrica.calcularArea(figuras);

        //Dupla assinatura, retornando apenas a figura passada
        figuraGeometrica.calcularArea(triangulo);

    }
}
