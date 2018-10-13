package com.design.patterns.um.templatemethod.um.service;

import com.design.patterns.um.model.Orcamento;

public class ImpostoX extends TemplateDeImpostoCondicional {

    @Override
    protected boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
        return orcamento.getTotalOrcamento() > 500;
    }

    @Override
    protected double maximaTaxacao(Orcamento orcamento) {
        return orcamento.getTotalOrcamento() * 0.07;
    }

    @Override
    protected double minimaTaxacao(Orcamento orcamento) {
        return orcamento.getTotalOrcamento() * 0.05;
    }
}
