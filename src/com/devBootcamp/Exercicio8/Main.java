package com.devBootcamp.Exercicio8;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(5D);
        Retangulo retangulo = new Retangulo(5D,10D);
        Triangulo triangulo = new Triangulo(5D);
        Circulo circulo = new Circulo(5D);

        List<Figura> figuras = List.of(quadrado,retangulo,triangulo,circulo);

        FiguraGeometrica figuraGeometrica = new FiguraGeometrica();
        //Retornando a lista inteira
        figuraGeometrica.calcularArea(figuras);

        //Dupla assinatura, retornando apenas a figura passada
        figuraGeometrica.calcularArea(triangulo);

    }
}
