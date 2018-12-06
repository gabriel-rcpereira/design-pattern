package com.design.patterns.um.state.um.model.state;

import com.design.patterns.um.state.um.model.Orcamento;

public abstract class EstadoOrcamento {

    protected Orcamento orcamento;

    public EstadoOrcamento(Orcamento orcamento) {
        this.orcamento = orcamento;
    }

    public abstract double aplicaDesconto();
    public abstract void emAprovacao();
    public abstract void aprovado();
    public abstract void reprovado();
    public abstract void finalizado();
}
