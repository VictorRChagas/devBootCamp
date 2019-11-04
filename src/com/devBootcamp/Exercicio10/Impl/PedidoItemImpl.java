package com.devBootcamp.Exercicio10.Impl;

import com.devBootcamp.Exercicio10.Crud.CrudServiceImpl;
import com.devBootcamp.Exercicio10.Pedido.EmailService;
import com.devBootcamp.Exercicio10.Pedido.Item;
import com.devBootcamp.Exercicio10.Pedido.PedidoItem;
import com.devBootcamp.Exercicio10.Pedido.PedidoItemService;

import java.math.BigDecimal;

public class PedidoItemImpl extends CrudServiceImpl<PedidoItem> implements PedidoItemService {
    @Override
    protected void postSave(PedidoItem entity) {
        BigDecimal somaTotalItens = BigDecimal.valueOf(0);
        entity.getPedido().getVendedor().getPercentualComissao();
        for (PedidoItem pedidoItem : entity.getPedido().getPedidoItensList()) {
            somaTotalItens.add(pedidoItem.getValorTotal());
        }
        BigDecimal comissao = somaTotalItens.divide(entity.getPedido().getVendedor().getPercentualComissao());
        entity.getPedido().getVendedor().setComissao(comissao);

    }
}
