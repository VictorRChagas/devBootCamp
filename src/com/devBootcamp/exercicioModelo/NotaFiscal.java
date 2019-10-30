package com.devBootcamp.exercicioModelo;

import com.devBootcamp.exercicio1.Endereco;

import java.util.ArrayList;
import java.util.List;

public class NotaFiscal {
    private int id;
    private int numeroNota;
    private Cliente cliente;
    private Enderecos enderecoEntrega;
    private double valorTotal;
    private List<NotaFiscalItem> listNotaFIscalItem = new ArrayList<>();


    public NotaFiscal(int id, int numeroNota, Cliente cliente, double valorTotal) {
        this.id = id;
        this.numeroNota = numeroNota;
        this.cliente = cliente;
        this.valorTotal = valorTotal;
    }

    public int getId() {
        return id;
    }

    public int getNumeroNota() {
        return numeroNota;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Enderecos getEnderecoEntrega() {
        return cliente.getEnderecoEntrega();
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void addItem(NotaFiscalItem notaFiscalItem){
        listNotaFIscalItem.add(notaFiscalItem);
    }

    public void resumoNota(){
        System.out.println("Nota Fiscal: ");
        System.out.println("Numero Nota: " + numeroNota);
        System.out.println();
        System.out.println("Cliente: ");
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("CPF: " + cliente.getCPF());
        System.out.println("---------------------------");
        System.out.println("Endereço Entrega: ");
        System.out.println("Rua: " + cliente.getEnderecoEntrega().getRua() + ", " + cliente.getEnderecoEntrega().getNumero() + "\nBairro: " + cliente.getEnderecoEntrega().getBairro());
        System.out.println("----------------------------");
        System.out.println("Lista itens: ");
        for (NotaFiscalItem notaFiscalItem : listNotaFIscalItem) {
            System.out.println("Produto: " + notaFiscalItem.getProduto().getDescricao());
            System.out.println("Quantidade: " + notaFiscalItem.getQuantidade());
            System.out.println("Valor unitario: " + notaFiscalItem.getValorUnitario());
            System.out.println("Valor total: " + notaFiscalItem.getValorTotal());
        }
    }

}
