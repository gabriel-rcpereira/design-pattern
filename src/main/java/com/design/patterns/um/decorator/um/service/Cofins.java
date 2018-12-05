package com.design.patterns.um.decorator.um.service;

import com.design.patterns.um.decorator.um.model.Orcamento;

public class Cofins extends ImpostoComplexo {

    public Cofins() {
    }

    public Cofins(ImpostoComplexo impostoComplexoDecorator) {
        super(impostoComplexoDecorator);
    }

    @Override
    public double calcula(Orcamento orcamento) {
        return (orcamento.getValor() * 0.10) + calculaImpostoDecorator(orcamento);
    }
}
