package com.design.patterns.um.decorator.um.service;

import com.design.patterns.um.decorator.um.model.Orcamento;

public class ImpostoMuitoAlto extends ImpostoComplexo {

    public ImpostoMuitoAlto() {
    }

    public ImpostoMuitoAlto(ImpostoComplexo impostoComplexoDecorator) {
        super(impostoComplexoDecorator);
    }

    @Override
    public double calcula(Orcamento orcamento) {
        return (orcamento.getValor() * 0.20) + calculaImpostoDecorator(orcamento);
    }
}
