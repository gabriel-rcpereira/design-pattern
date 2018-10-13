package com.design.patterns.um.chainofresponsibility.um.service;

import com.design.patterns.um.model.Orcamento;

public class DescontoPorMaisDeQuinhentosReaisService implements Desconto {

    private Desconto proximo;

    @Override
    public double desconta(Orcamento orcamento) {
        if(orcamento.getTotalOrcamento() > 500) {
            return orcamento.getTotalOrcamento() * 0.07;
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
