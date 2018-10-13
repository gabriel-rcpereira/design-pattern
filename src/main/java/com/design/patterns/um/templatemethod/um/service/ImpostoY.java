package com.design.patterns.um.templatemethod.um.service;

import com.design.patterns.um.model.Orcamento;

public class ImpostoY extends TemplateDeImpostoCondicional {

    @Override
    protected boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
        return orcamento.getTotalOrcamento() > 500 && temItemMaiorQue100ReaisNoCarrinho(orcamento);
    }

    @Override
    protected double maximaTaxacao(Orcamento orcamento) {
        return orcamento.getTotalOrcamento() * 0.10;
    }

    @Override
    protected double minimaTaxacao(Orcamento orcamento) {
        return orcamento.getTotalOrcamento() * 0.06;
    }

    private boolean temItemMaiorQue100ReaisNoCarrinho(Orcamento orcamento) {
        return orcamento.getItens().stream()
                .filter(filter -> filter.getValor() > 100.0)
                .count() > 0;
    }
}
