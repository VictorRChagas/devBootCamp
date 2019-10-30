package com.devBootcamp.exercicio1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Joao");
        pessoa.setSobrenome("Chagas");
        pessoa.setCPF(9999999);
        pessoa.setEmail("jvrc2000@outlook.com");
        pessoa.setDataNascimento(LocalDate.of(2000,03,10));

        pessoa.adicionarEnderecos("Rua Tapir", 1285,"Centro");
        pessoa.adicionarEnderecos("Avenida Fernandes Lima", 100,"Sambugaro");
        pessoa.adicionarTelefones("888888",TipoTelefone.CELULAR);

        pessoa.dadosPessoa();

        Pessoa Maicon = new Pessoa();
        Maicon.setNome("Maicon");
        Maicon.setSobrenome("Chaique");
        Maicon.setCPF(88888888);
        Maicon.setEmail("maicon@gmail.com");

        Maicon.adicionarEnderecos("Rua Guarani", 500,"Fraron");
        Maicon.adicionarEnderecos("Avenida Tupi", 285,"Industrial");
        Maicon.adicionarTelefones("888888",TipoTelefone.CELULAR);

        Maicon.dadosPessoa();
    }
}
