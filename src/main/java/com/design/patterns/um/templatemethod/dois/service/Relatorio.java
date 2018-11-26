package com.design.patterns.um.templatemethod.dois.service;

import com.design.patterns.um.templatemethod.dois.model.Conta;

import java.util.List;

public abstract class Relatorio {

    private List<Conta> contas;

    public Relatorio(List<Conta> contas){
        this.contas = contas;
    }

    public void imprimirRelatorio(){
        System.out.println("Cabeçalho: " + this.cabecalho(contas.get(0)));
        contas.forEach(c ->
                System.out.println("Corpo: " + this.corpo(c))
        );
        System.out.println("Rodape: " + this.rodape(contas.get(0)));
    }

    protected abstract String cabecalho(Conta conta);

    protected abstract String corpo(Conta conta);

    protected abstract String rodape(Conta conta);
}
