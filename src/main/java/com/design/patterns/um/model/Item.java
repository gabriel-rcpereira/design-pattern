package com.design.patterns.um.model;

public class Item {

    private final String descricao;
    private final Double valor;

    public Item(String descricao, Double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public Double getValor() {
        return valor;
    }
}
