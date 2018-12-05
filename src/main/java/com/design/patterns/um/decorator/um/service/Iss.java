package com.design.patterns.um.decorator.um.service;

import com.design.patterns.um.decorator.um.model.Orcamento;

public class Iss extends ImpostoComplexo {

    public Iss() {
    }

    public Iss(ImpostoComplexo impostoComplexoDecorator) {
        super(impostoComplexoDecorator);
    }

    @Override
    public double calcula(Orcamento orcamento) {
        return (orcamento.getValor() * 0.15) + calculaImpostoDecorator(orcamento);
    }
}
