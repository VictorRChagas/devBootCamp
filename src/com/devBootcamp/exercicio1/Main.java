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
        pessoa.setNome("Maicon");
        pessoa.setSobrenome("Chaique");
        pessoa.setCPF(88888888);
        pessoa.setEmail("maicon@gmail.com");

        pessoa.adicionarEnderecos("Rua Guarani", 500,"Fraron");
        pessoa.adicionarEnderecos("Avenida Tupi", 285,"Industrial");
        pessoa.adicionarTelefones("888888",TipoTelefone.CELULAR);

        pessoa.dadosPessoa();
    }
}
