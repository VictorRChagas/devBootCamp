package com.devBootcamp.Exercicio10.Impl;

import com.devBootcamp.Exercicio10.Crud.CrudServiceImpl;
import com.devBootcamp.Exercicio10.Pedido.Item;
import com.devBootcamp.Exercicio10.Pedido.ItemService;

import java.math.BigDecimal;

public class ItemServiceImpl extends CrudServiceImpl<Item> implements ItemService {
    @Override
    protected void preSave(Item entity) {
        if(entity.getValorUnitario().equals(0)){
            throw new RuntimeException("Sem valor unitario informado");
        }
        if(entity.isInativo() == false){
            throw new RuntimeException("Produto inativo");
        }
    }
}
