package com.devBootcamp.Exercicio02;

public class Carro {
    private String modelo;
    private String cor;
    private Integer ano;
    private Marca marca;
    private String chassi;
    private Propietario proprietario;
    private Double velocidadeMaxima;
    private Double velocidadeAtual = 0D;
    private Integer numeroMarchas;
    private Double quantidadeCombustivel;
    private Integer marchaAtual = 0;

    public Carro(Double quantidadeCombustivel) {
        this.quantidadeCombustivel = quantidadeCombustivel;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public Propietario getProprietario() {
        return proprietario;
    }

    public void setProprietario(Propietario proprietario) {
        this.proprietario = proprietario;
    }

    public Double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(Double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public Double getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(Double velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public Integer getNumeroMarchas() {
        return numeroMarchas;
    }

    public void setNumeroMarchas(Integer numeroMarchas) {
        this.numeroMarchas = numeroMarchas;
    }

    public Double getQuantidadeCombustivel() {
        return quantidadeCombustivel;
    }

    public void setQuantidadeCombustivel(Double quantidadeCombustivel) {
        this.quantidadeCombustivel = quantidadeCombustivel;
    }

    public void acelerar(){
            velocidadeAtual+= 1;
            System.out.println("Velocidade Atual: " + velocidadeAtual);
            System.out.println("Acelerando! ");
            System.out.println();
        if (velocidadeAtual==velocidadeMaxima){
            velocidadeAtual = velocidadeMaxima;
            System.out.println("Atingiu velocidade máxima! ");
            System.out.println();
        }
    }

    public void frear(){
        this.velocidadeAtual = 0D;
        System.out.println("O freio foi acionado");
        System.out.println();
    }

    public void trocarMarcha(){
        if (marchaAtual < numeroMarchas){
            marchaAtual++;
            System.out.println("Aumentando a marcha! ");
            System.out.println();
        }else if(marchaAtual == numeroMarchas){
            marchaAtual = numeroMarchas;
            System.out.println("Marcha maxima! ");
            System.out.println();
        }
    }

    public void reduzirMarcha(){
        if (marchaAtual >= 0 && marchaAtual <=numeroMarchas){
            marchaAtual--;
            System.out.println("Reduzindo Marcha! ");
            System.out.println();
        }

        if (marchaAtual == 0){
            System.out.println("Ponto neutro! ");
            System.out.println();
        }
    }

    public void marchaRe(){
        if(velocidadeAtual == 0){
            System.out.println("Marcha ré");
            System.out.println();
        }else{
            System.out.println("O carro precisa está na marcha 0 para dar ré! ");
            System.out.println();
        }
    }

    public Double getAutonomiaViagem(Double consumoMedio){
        return quantidadeCombustivel*consumoMedio;
    }

    public void dadosCarro(){
        System.out.println("Ficha Técnica do Carro: ");
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Ano: " + ano);
        System.out.println("Marca: " + marca.getNome());
        System.out.println("Chassi: " + chassi);
        System.out.println("Velocidade Maxima: " + velocidadeMaxima);
        System.out.println("Numero de Marchas: " + numeroMarchas);
        System.out.println("--------------------------------");
        System.out.println();
    }
}
