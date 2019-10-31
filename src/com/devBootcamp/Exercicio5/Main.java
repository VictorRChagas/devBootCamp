package com.devBootcamp.Exercicio5;

public class Main {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(10D);
        ContaPoupanca contaPoupanca = new ContaPoupanca(20D);

        //Conta Corrente
        contaCorrente.setNumeroConta(1232);
        contaCorrente.setSaldoAtual(100D);
        contaCorrente.depositar(100D);
        contaPoupanca.sacar(40D);
        contaCorrente.extratoConta();


        //Conta Poupança
        contaPoupanca.setNumeroConta(2234);
        contaPoupanca.setSaldoAtual(350.50);
        contaPoupanca.depositar(200D);
        contaPoupanca.sacar(200D);
        contaPoupanca.extratoConta();


    }
}
