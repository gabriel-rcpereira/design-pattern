package com.design.patterns.um.chainofresponsibility.um.service;

import com.design.patterns.um.model.Orcamento;

public class DescontoPorMaisDeCincoItensService implements Desconto {

    private Desconto proximo;

    @Override
    public double desconta(Orcamento orcamento) {
        if(orcamento.getItens().size() > 5) {
            return orcamento.getTotalOrcamento() * 0.1;
        }
        else {
            return proximo.desconta(orcamento);
        }
    }

    @Override
    public void setProximo(Desconto proximo) {
        this.proximo = proximo;
    }
}
