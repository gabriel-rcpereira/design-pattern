package com.design.patterns.um.decorator.dois.service;

import com.design.patterns.um.decorator.dois.model.Conta;

import java.util.ArrayList;
import java.util.List;

public abstract class Filtro {

    private Filtro filtroDecorator;

    public Filtro() {
    }

    public Filtro(Filtro filtroDecorator) {
        this.filtroDecorator = filtroDecorator;
    }

    public abstract List<Conta> aplicar(List<Conta> contas);

    protected final List<Conta> aplicarDecorator(List<Conta> contas){
        return (filtroDecorator == null) ? new ArrayList<>() : filtroDecorator.aplicar(contas);
    }

    protected final List<Conta> mesclar(List<Conta> contas, List<Conta> contasDecorator) {
        contas.removeAll(contasDecorator);
        contas.addAll(contasDecorator);

        return contas;
    }
}
