package com.design.patterns.um.state.um.model.state;

import com.design.patterns.um.state.um.exception.OperacaoNaoPermitadaRuntimeException;
import com.design.patterns.um.state.um.model.Orcamento;

public class Aprovado extends EstadoOrcamento {

    public Aprovado(Orcamento orcamento) {
        super(orcamento);
    }

    @Override
    public double aplicaDesconto() {
        return orcamento.getValor() - (orcamento.getValor() * 0.05);
    }

    @Override
    public void emAprovacao() {
        throw new OperacaoNaoPermitadaRuntimeException();
    }

    @Override
    public void aprovado() {
        throw new OperacaoNaoPermitadaRuntimeException();
    }

    @Override
    public void reprovado() {
        orcamento.setEstadoOrcamento(new Reprovado(orcamento));
    }

    @Override
    public void finalizado() {
        orcamento.setEstadoOrcamento(new Finalizado(orcamento));
    }
}
