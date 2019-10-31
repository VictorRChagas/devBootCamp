package com.devBootcamp.Exercicio5;

public abstract class ContaBancaria {
    protected Integer numeroConta;
    protected Double saldoAtual = 0D;

    public Integer getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(Integer numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Double getSaldoAtual() {
        return saldoAtual;
    }

    public void setSaldoAtual(Double saldoAtual) {
        this.saldoAtual = saldoAtual;
    }

    public abstract void sacar(Double valor);

    public abstract void  depositar(Double valor);

    public abstract void extratoConta();
}
