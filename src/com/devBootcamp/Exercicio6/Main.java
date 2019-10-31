package com.devBootcamp.Exercicio6;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        //Pessoa
        Pessoa pessoa = new Pessoa("Joao","8888888");
        pessoa.getDadosPessoa();

        //Empregado
        Empregado empregado = new Empregado("Victor","7777777");
        empregado.setSalarioBase(BigDecimal.valueOf(1000));
        empregado.setImposto(BigDecimal.valueOf(200));
        empregado.getDadosVendedor();

        Vendedor vendedor = new Vendedor("Victor","7777777");
        vendedor.setSalarioBase(BigDecimal.valueOf(1000));
        vendedor.setValorProdutosVendidos(BigDecimal.valueOf(5000));
        vendedor.setComissao(BigDecimal.valueOf(10));
        vendedor.setImposto(BigDecimal.valueOf(100));
        vendedor.getDadosVendedor();

        //Gerente
        Gerente gerente = new Gerente("Maicon", "99999999");
        gerente.setAjudaCustos(BigDecimal.valueOf(100));
        gerente.setPercentualComissao(BigDecimal.valueOf(10));
        gerente.setSalarioBase(BigDecimal.valueOf(1000));
        gerente.setImposto(BigDecimal.valueOf(20));
        gerente.setListVendedoresSobGerencia(vendedor);
        gerente.getDadosGerente();





    }
}
