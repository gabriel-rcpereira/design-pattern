package com.design.patterns.um.decorator.um.service;

import com.design.patterns.um.decorator.um.model.Orcamento;

public abstract class ImpostoComplexo {

    private ImpostoComplexo impostoComplexoDecorator;

    public ImpostoComplexo() {
    }

    public ImpostoComplexo(ImpostoComplexo impostoComplexoDecorator) {
        this.impostoComplexoDecorator = impostoComplexoDecorator;
    }

    public abstract double calcula(Orcamento orcamento);

    protected final double calculaImpostoDecorator(Orcamento orcamento){
        return (impostoComplexoDecorator == null) ? 0.0 : impostoComplexoDecorator.calcula(orcamento);
    }
}
