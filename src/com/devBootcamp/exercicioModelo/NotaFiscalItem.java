package com.devBootcamp.exercicioModelo;

public class NotaFiscalItem {
    private int id;
    private NotaFiscal notaFiscal;
    private Produto produto;
    private int quantidade;
    private double valorUnitario;

    public NotaFiscalItem(int id, NotaFiscal notaFiscal, Produto produto, int quantidade, double valorUnitario) {
        this.id = id;
        this.notaFiscal = notaFiscal;
        this.produto = produto;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
    }

    public int getId() {
        return id;
    }

    public NotaFiscal getNotaFiscal() {
        return notaFiscal;
    }

    public String getProduto() {
        return produto.getDescricao();
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public double getValorTotal() {
        double valorTotal = getValorUnitario() * getQuantidade();
        return valorTotal;
    }


}
