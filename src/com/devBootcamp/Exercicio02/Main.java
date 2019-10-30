package com.devBootcamp.Exercicio02;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Marca marca = new Marca();
        marca.setNome("Toyota");
        marca.setDataFabricacao(LocalDate.of(2018,12,15));
        marca.dadosMarca();

        Carro carro = new Carro(100D);
        carro.setModelo("Classic");
        carro.setCor("Azul");
        carro.setAno(2017);
        carro.setMarca(marca);
        carro.setChassi("666DE");
        carro.setVelocidadeMaxima(185.2);
        carro.setNumeroMarchas(6);
        carro.dadosCarro();

        Propietario propietario = new Propietario("João", "88888","99999");
        carro.setProprietario(propietario);
        propietario.dadosPropietario();

        Endereco endereco = new Endereco();
        endereco.setRua("Rua Tapir");
        endereco.setNumero("1285");
        endereco.setBairro("Centro");
        endereco.dadosEndereco();

        System.out.println("A autonomia do carro na viagem é de: " + carro.getAutonomiaViagem(10.0) + "Km's");
        carro.acelerar();

    }
}
