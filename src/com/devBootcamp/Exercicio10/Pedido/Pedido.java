package com.devBootcamp.Exercicio10.Pedido;

import com.devBootcamp.Exercicio10.Cliente.Cliente;
import com.devBootcamp.Exercicio10.Crud.BaseObject;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Pedido extends BaseObject {
    private Cliente cliente;
    private Vendedor vendedor;
    private LocalDate dataDeCadastro;
    private LocalDate dataValidade;
    private LocalDate previsaoEntrega;
    private String enderecoEntrega;
    private String observacao;
    private FormaDePagamento formaDePagamento;
    private List<PedidoItem> pedidoItensList = new ArrayList<>();

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public LocalDate getDataDeCadastro() {
        return dataDeCadastro;
    }

    public void setDataDeCadastro(LocalDate dataDeCadastro) {
        this.dataDeCadastro = dataDeCadastro;
    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(LocalDate dataValidade) {
        this.dataValidade = dataValidade;
    }

    public LocalDate getPrevisaoEntrega() {
        return previsaoEntrega;
    }

    public void setPrevisaoEntrega(LocalDate previsaoEntrega) {
        this.previsaoEntrega = previsaoEntrega;
    }

    public String getEnderecoEntrega() {
        return enderecoEntrega;
    }

    public void setEnderecoEntrega(String enderecoEntrega) {
        this.enderecoEntrega = enderecoEntrega;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public FormaDePagamento getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setFormaDePagamento(FormaDePagamento formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }

    public List<PedidoItem> getPedidoItensList() {
        return pedidoItensList;
    }

    public void setPedidoItensList(List<PedidoItem> pedidoItensList) {
        this.pedidoItensList = pedidoItensList;
    }

    public void resumo(){
        System.out.println("Nome do cliente: " + cliente.getNome());
        System.out.println("Nome do vendedor: " + vendedor.getNome());
        System.out.println("Previsao de entrega: " + getPrevisaoEntrega());
        System.out.println("Endereço de entrega: " + getEnderecoEntrega());
        System.out.println("Observação: " + getObservacao());
        System.out.println("Forma de pagamento: " + getFormaDePagamento());
    }
}
