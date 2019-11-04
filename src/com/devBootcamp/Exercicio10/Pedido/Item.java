package com.devBootcamp.Exercicio10.Pedido;

import com.devBootcamp.Exercicio10.Crud.BaseObject;

import java.math.BigDecimal;

public class Item extends BaseObject {
    private String descricao;
    private boolean inativo = true;
    private Integer quantidadeEmEstoque;
    private BigDecimal valorUnitario;

    public void setQuantidadeEmEstoque(Integer quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isInativo() {
        return inativo;
    }

    public void setInativo(boolean inativo) {
        this.inativo = inativo;
    }

    public Integer getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public BigDecimal getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(BigDecimal valorUnitario) {
        this.valorUnitario = valorUnitario;
    }
}
