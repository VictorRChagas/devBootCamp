package com.devBootcamp.Exercicio6;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Gerente extends Empregado {
    private BigDecimal ajudaCustos;
    private List<Vendedor> listVendedoresSobGerencia = new ArrayList<>();
    private BigDecimal percentualComissao;
    private BigDecimal valorComissaoSobVendedores = BigDecimal.valueOf(0);


    public Gerente(String nome, String CPF) {
        super(nome, CPF);
    }

    public BigDecimal getAjudaCustos() {
        return ajudaCustos;
    }

    public void setAjudaCustos(BigDecimal ajudaCustos) {
        this.ajudaCustos = ajudaCustos;
    }

    public List<Vendedor> getListVendedoresSobGerencia() {
        return listVendedoresSobGerencia;
    }

    public void setListVendedoresSobGerencia(Vendedor vendedor) {
        listVendedoresSobGerencia.add(vendedor);
    }

    public BigDecimal getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(BigDecimal percentualComissao) {
        this.percentualComissao = percentualComissao;
    }

    public BigDecimal getValorComissaoSobVendedores() {
        return valorComissaoSobVendedores;
    }

    public BigDecimal calcularSalario(){
        BigDecimal salarioTotal = BigDecimal.valueOf(0);
        for (Vendedor vendedor : listVendedoresSobGerencia) {
            valorComissaoSobVendedores = valorComissaoSobVendedores.add(vendedor.getValorProdutosVendidos().multiply(percentualComissao).divide(BigDecimal.valueOf(100)));
        }
        salarioTotal = valorComissaoSobVendedores.add(ajudaCustos).add(salarioBase).subtract(imposto);
        return salarioTotal;
    }

    public void getDadosGerente(){
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCPF());
        System.out.println("Salario base: " + getSalarioBase());
        System.out.println("Impostos: " + getImposto());
        System.out.println("AJuda de custos: " + getAjudaCustos());
        System.out.println("Comissao: " + getValorComissaoSobVendedores());
        System.out.println("Salario liquido: " + calcularSalario());
        System.out.println("*******************************");
    }

}
