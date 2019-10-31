package com.devBootcamp.Exercicio4;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args){
        Voo voo = new Voo(1, LocalDateTime.now(),100);

        voo.getData();
        voo.getNumeroMaximoPassageiros();
        voo.ocuparAcento(5);
        voo.ocuparAcento(6);
        voo.ocuparAcento(7);
        System.out.println("Primeiro acento livre: " + voo.primeiroAcentoLivre());
        voo.acentosLivres();
        voo.verificaAcento(5);
        System.out.println("Proximo acento livre: " + voo.proximoAcentoLivre(7));

        voo.dadosVoo();

    }
}
