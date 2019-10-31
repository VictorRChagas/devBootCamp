package com.devBootcamp.Exercicio6;

import java.math.BigDecimal;

public class Empregado extends Pessoa {
    protected BigDecimal salarioBase;
    protected BigDecimal imposto;

    public Empregado(String nome, String CPF) {
        super(nome, CPF);
    }

    public BigDecimal getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(BigDecimal salarioBase) {
        this.salarioBase = salarioBase;
    }

    public BigDecimal getImposto() {
        return imposto;
    }

    public void setImposto(BigDecimal imposto) {
        this.imposto = imposto;
    }

    public BigDecimal calcularSalario(){
        return salarioBase.subtract(imposto);
    }

    public void getDadosVendedor(){
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCPF());
        System.out.println("Salario Base: " + getSalarioBase());
        System.out.println("Imposto: " + getImposto());
        System.out.println("Salario bruto: " + calcularSalario());
        System.out.println("*******************************");
    }
}
