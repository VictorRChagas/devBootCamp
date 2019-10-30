package com.devBootcamp.Exercicio3;

public class Elevador {
    private Integer andarAtual = 0;
    private Integer totalAndares;
    private Integer capacidadeElevador;
    private Integer pessoasPresentes = 0;

    public Elevador(Integer totalAndares, Integer capacidadeElevador) {
        this.totalAndares = totalAndares;
        this.capacidadeElevador = capacidadeElevador;
    }

    public Integer getAndarAtual() {
        return andarAtual;
    }

    public Integer getPessoasPresentes() {
        return pessoasPresentes;
    }

    public Integer getTotalAndares() {
        return totalAndares;
    }

    public Integer getCapacidadeElevador() {
        return capacidadeElevador;
    }

    public void entrar() {
        if (pessoasPresentes == capacidadeElevador){
            System.out.println("Não podemos exceder a capacidade máxima! ");
            return;
        }
        System.out.println("Alguem entrou! ");
        pessoasPresentes++;
        System.out.println("Pessoas presentes: " + pessoasPresentes);
    }

    public void sair() {
        if (pessoasPresentes == 0){
            System.out.println("Não há ninguem para sair! ");
            return;
        }
        System.out.println("Alguem saiu! ");
        pessoasPresentes--;
        System.out.println("Pessoas presentes: " + pessoasPresentes);
    }

    public void subir() {
        if(pessoasPresentes > 0){
            if (andarAtual == totalAndares){
                System.out.println("Já está na cobertura! ");
                return;
            }
            System.out.println("Subindo! ");
            andarAtual++;
        }

    }

    public void descer() {
        if (pessoasPresentes > 0){
            if (andarAtual == 0){
                System.out.println("Já está no terreo! ");
                return;
            }
            System.out.println("Descendo! ");
            andarAtual--;
        }

    }

}




