package com.devBootcamp.Exercicio4;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Voo {
    private Integer numeroVoo;
    private LocalDateTime dataHora;
    private Integer numeroMaximoPassageiros;
    private List<Integer> acentos = new ArrayList<>();
    private List<Integer> acentosOcupados = new ArrayList<>();

    public Voo(Integer numeroVoo, LocalDateTime dataHora, Integer numeroMaximoPassageiros) {
        this.numeroVoo = numeroVoo;
        this.dataHora = dataHora;
        this.numeroMaximoPassageiros = numeroMaximoPassageiros;
        popularListaLivre();
    }

    public Integer getVoo() {
        return numeroVoo;
    }

    public LocalDateTime getData() {
        return dataHora;
    }

    public Integer getNumeroMaximoPassageiros() {
        return numeroMaximoPassageiros;
    }

    public Integer primeiroAcentoLivre(){
        int primeiraAcentoLivre = 0;
        int cont = 0;
        for (Integer acentoLivre : acentosOcupados) {
            if(cont == 1){
                primeiraAcentoLivre = acentoLivre;
            }
        }
        return primeiraAcentoLivre+1;
    }

    public Integer proximoAcentoLivre(Integer pontoPartida){
        Integer proximoAcentoLivre = 0;
        for (int i = pontoPartida; i < acentos.size(); i++) {
            if (i == pontoPartida){
                proximoAcentoLivre = i +1;
            }
        }
        return proximoAcentoLivre;
    }

    public void popularListaLivre(){
        for (int i = 1 ; i <= numeroMaximoPassageiros; i++){
            acentos.add(i);
        }
    }

    public void ocuparAcento(Integer acento){
        acentos.remove(acento);
        acentosOcupados.add(acento);
    }

    public void acentosLivres(){
        for (Integer acento : acentos) {
            System.out.print(acento + " - ");
        }
        System.out.println();
    }

    public void verificaAcento(Integer acentoVerificar){
        for (Integer ocupado : acentosOcupados) {
            if (ocupado.equals(acentoVerificar)){
                System.out.println("Acento Ocupado! ");
                return;
            }else{
                System.out.println("Acento Livre! ");
            }
        }
    }

    public void dadosVoo(){
        System.out.println("Mês do vôo: " + this.getData().getDayOfMonth() + "/" + this.getData().getMonth() + "/" + this.getData().getYear() );
        System.out.println("Hora do vôo: " + this.getData().getHour() + ":" + this.getData().getMinute());
        System.out.println("Numero Vôo: " + this.getVoo());
    }




}
