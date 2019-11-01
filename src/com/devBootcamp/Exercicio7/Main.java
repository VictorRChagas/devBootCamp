package com.devBootcamp.Exercicio7;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Joao","Chagas","8888","jvrc@gmail.com",20);
        Pessoa pessoa2 = new Pessoa("Victor","Santos","999","victor@gmail.com",15);
        Pessoa John = new Pessoa("Victor","Santos","999","victor@gmail.com",20);
        Pessoa Victor = new Pessoa("Victor","Santos","999","victor@gmail.com",15);

        GrupoPessoas grupoPessoasMaiores = new GrupoPessoas();
        grupoPessoasMaiores.setGrupoPessoaMaioresIdadeList(pessoa1);
        grupoPessoasMaiores.setGrupoPessoaMaioresIdadeList(Victor);
        GrupoPessoas grupoPessoasMenores = new GrupoPessoas();
        grupoPessoasMenores.setGrupoPessoaMenoresIdadeList(pessoa2);
        grupoPessoasMenores.setGrupoPessoaMenoresIdadeList(John);

        grupoPessoasMaiores.getListPessoasMaiores();
        grupoPessoasMenores.getListPessoasMenores();

    }

}
