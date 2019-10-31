package com.devBootcamp.Exercicio5;

public class ContaCorrente extends ContaBancaria {
    private Double taxaOperacao;

    public ContaCorrente(Double taxaOperacao) {
        this.taxaOperacao = taxaOperacao;
    }

    public Double getTaxaOperacao() {
        return taxaOperacao;
    }

    @Override
    public void sacar(Double valorSaque) {
        if (valorSaque >saldoAtual){
            System.out.println("Ops, Você não tem saldo suficiente; ");
        }else{
            saldoAtual-= valorSaque - ((taxaOperacao*saldoAtual)/100);
        }
    }

    @Override
    public void depositar(Double valorDeposito) {
        saldoAtual+=  valorDeposito - ((taxaOperacao*saldoAtual)/100);
    }

    @Override
    public void extratoConta() {
        System.out.println("Numero conta: " + numeroConta);
        System.out.println("Saldo Atual: " + saldoAtual);
        System.out.println();
    }
}
