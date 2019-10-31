package com.devBootcamp.Exercicio5;

public class ContaPoupanca extends ContaBancaria {
    private Double limite;

    public ContaPoupanca(Double limite) {
        this.limite = limite;
    }

    @Override
    public void sacar(Double valor) {
        if (valor > saldoAtual+limite){
            System.out.println("Ops, Você não tem saldo suficiente; ");
        }else{
            saldoAtual-= valor;
        }
    }

    @Override
    public void depositar(Double valor) {
        saldoAtual+=  valor;
    }

    @Override
    public void extratoConta() {
        System.out.println("Numero conta: " + numeroConta);
        System.out.println("Saldo Atual: " + saldoAtual);
        System.out.println();
    }
}
