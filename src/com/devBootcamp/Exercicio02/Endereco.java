package com.devBootcamp.Exercicio02;

public class Endereco {
    private String rua;
    private String numero;
    private String bairro;

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void dadosEndereco(){
        System.out.println("Endereço do Proprietario do Veiculo: ");
        System.out.println("Rua: " + rua);
        System.out.println("Nº: " + numero);
        System.out.println("Bairro: " + bairro);
        System.out.println("--------------------------------");
        System.out.println();
    }
}
