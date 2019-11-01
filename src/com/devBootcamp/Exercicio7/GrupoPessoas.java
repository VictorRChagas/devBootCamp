package com.devBootcamp.Exercicio7;

import java.util.ArrayList;
import java.util.List;

public class GrupoPessoas {
    private List<Pessoa> grupoPessoaMaioresIdadeList = new ArrayList<>();
    private List<Pessoa> grupoPessoaMenoresIdadeList = new ArrayList<>();

    public List<Pessoa> getGrupoPessoaMaioresIdadeList() {
        return grupoPessoaMaioresIdadeList;
    }

    public void setGrupoPessoaMaioresIdadeList(Pessoa pessoa) {
        if(pessoa.getIdade() < 18){
            System.out.println("Desculpa só pode entrar maiores de idade nesta lista! ");
            System.out.println("*****************************************");
            System.out.println();
            return;
        }
        grupoPessoaMaioresIdadeList.add(pessoa);
    }

    public List<Pessoa> getGrupoPessoaMenoresIdadeList() {
        return grupoPessoaMenoresIdadeList;
    }

    public void setGrupoPessoaMenoresIdadeList(Pessoa pessoa) {
        if(pessoa.getIdade() > 18){
            System.out.println("Voce está tentando inserir um maior de idade na lista errada! ");
            System.out.println("*****************************************");
            System.out.println();
            return;
        }
        grupoPessoaMenoresIdadeList.add(pessoa);
    }

    public void getListPessoasMaiores(){
        for (Pessoa pessoa : grupoPessoaMaioresIdadeList) {
            System.out.println("Nome: " + pessoa.getNome());
            System.out.println("Sobrenome: " + pessoa.getSobrenome());
            System.out.println("CPF: " + pessoa.getCPF());
            System.out.println("Email: " + pessoa.getEmail());
            System.out.println("Idade: " + pessoa.getIdade());
            System.out.println("**********************");
            System.out.println();
        }
    }

    public void getListPessoasMenores(){
        for (Pessoa pessoa : grupoPessoaMenoresIdadeList) {
            System.out.println("Nome: " + pessoa.getNome());
            System.out.println("Sobrenome: " + pessoa.getSobrenome());
            System.out.println("CPF: " + pessoa.getCPF());
            System.out.println("Email: " + pessoa.getEmail());
            System.out.println("Idade: " + pessoa.getIdade());
            System.out.println("**********************");
            System.out.println();
        }
    }
}
