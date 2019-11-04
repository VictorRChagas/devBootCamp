package com.devBootcamp.Exercicio10.Pedido;

import com.devBootcamp.Exercicio10.Crud.BaseObject;

import java.math.BigDecimal;

public class PedidoItem extends BaseObject {
    private Pedido pedido;
    private Item item;
    private Integer quantidade;
    private BigDecimal valorUnitario;
    private BigDecimal valorDesconto;
    private BigDecimal valorTotal;

    public Pedido getPedido() {
        return pedido;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(BigDecimal valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public BigDecimal getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(BigDecimal valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public BigDecimal getValorTotal(){
        return valorUnitario.multiply(BigDecimal.valueOf(quantidade)).subtract(valorDesconto);
    }

    public BigDecimal getValorTotalSemDesconto(){
        return valorUnitario.multiply(BigDecimal.valueOf(quantidade));
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
}
