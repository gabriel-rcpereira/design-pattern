package com.design.patterns.um.observer.um.builder;

import com.design.patterns.um.observer.um.model.ItemDaNota;

public class ItemNotaFiscalBuilder {

    private String nome;
    private double valor;

    public ItemNotaFiscalBuilder withNome(String nome){
        this.nome = nome;
        return this;
    }

    public ItemNotaFiscalBuilder withValor(double valor){
        this.valor = valor;
        return this;
    }

    public ItemDaNota build(){
        return new ItemDaNota(this.nome,
                this.valor);
    }
}
