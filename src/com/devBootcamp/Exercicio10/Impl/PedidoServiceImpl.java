package com.devBootcamp.Exercicio10.Impl;

import com.devBootcamp.Exercicio10.Crud.CrudServiceImpl;
import com.devBootcamp.Exercicio10.Pedido.Item;
import com.devBootcamp.Exercicio10.Pedido.Pedido;
import com.devBootcamp.Exercicio10.Pedido.PedidoItem;
import com.devBootcamp.Exercicio10.Pedido.PedidoService;

import java.math.BigDecimal;
import java.util.List;

public class PedidoServiceImpl extends CrudServiceImpl<Pedido> implements PedidoService {
    @Override
    protected void preSave(Pedido entity) {
        BigDecimal valorTotalTodosProdutos = BigDecimal.valueOf(0);
        for (PedidoItem pedidoItem : entity.getPedidoItensList()) {
            valorTotalTodosProdutos.add(pedidoItem.getValorTotalSemDesconto());
        }
        BigDecimal valorDescontoEsperado = valorTotalTodosProdutos.divide(entity.getVendedor().getPercentualComissao());
        if (valorDescontoEsperado.compareTo(valorDescontoEsperado) > 0){
            throw new RuntimeException("Valor do desconto maior que o esperado");
        }
    }
}
