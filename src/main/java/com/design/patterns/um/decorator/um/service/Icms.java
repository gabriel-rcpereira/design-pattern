package com.design.patterns.um.decorator.um.service;

import com.design.patterns.um.decorator.um.model.Orcamento;

public class Icms extends ImpostoComplexo {

    public Icms() {
    }

    public Icms(ImpostoComplexo impostoComplexoDecorator) {
        super(impostoComplexoDecorator);
    }

    @Override
    public double calcula(Orcamento orcamento) {
        return (orcamento.getValor() * 0.05) + calculaImpostoDecorator(orcamento);
    }
}
