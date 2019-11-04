package com.devBootcamp.Exercicio10.Pedido;

import com.devBootcamp.Exercicio10.Crud.BaseObject;

import java.math.BigDecimal;

public class Vendedor extends BaseObject {
    private String nome;
    private Double percentualComissao;
    private Double percentualDescontoMaximo;
    private BigDecimal comissao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(Double percentualComissao) {
        this.percentualComissao = percentualComissao;
    }

    public Double getPercentualDescontoMaximo() {
        return percentualDescontoMaximo;
    }

    public void setPercentualDescontoMaximo(Double percentualDescontoMaximo) {
        this.percentualDescontoMaximo = percentualDescontoMaximo;
    }

    public void setComissao(BigDecimal comissao) {
        this.comissao = comissao;
    }
}
