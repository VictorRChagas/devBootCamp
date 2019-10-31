package com.devBootcamp.Exercicio6;

import java.math.BigDecimal;

public class Vendedor extends Empregado {
    protected BigDecimal valorProdutosVendidos;
    protected BigDecimal comissao;


    public Vendedor(String nome, String CPF) {
        super(nome, CPF);
    }

    public BigDecimal getValorProdutosVendidos() {
        return valorProdutosVendidos;
    }

    public void setValorProdutosVendidos(BigDecimal valorProdutosVendidos) {
        this.valorProdutosVendidos = valorProdutosVendidos;
    }

    public BigDecimal getComissao() {
        return comissao;
    }

    public void setComissao(BigDecimal comissao) {
        this.comissao = comissao;
    }

    public BigDecimal calcularSalario(){
        BigDecimal salario= super.salarioBase.subtract(imposto);
        salario = salario.add(valorProdutosVendidos.multiply(comissao).divide(BigDecimal.valueOf(100)));
        return salario;
    }

    public void getDadosVendedor(){
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCPF());
        System.out.println("Salario base: " + getSalarioBase());
        System.out.println("Impostos: " + getImposto());
        System.out.println("Produtos vendidos: " + getValorProdutosVendidos());
        System.out.println("Porcentagem de comissao: " + getComissao());
        System.out.println("Salario liquido: " + calcularSalario());
        System.out.println("*******************************");
    }
}
