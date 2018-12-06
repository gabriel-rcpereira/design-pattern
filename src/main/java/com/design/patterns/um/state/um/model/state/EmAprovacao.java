package com.design.patterns.um.state.um.model.state;

import com.design.patterns.um.state.um.exception.OperacaoNaoPermitadaRuntimeException;
import com.design.patterns.um.state.um.model.Orcamento;

public class EmAprovacao extends EstadoOrcamento {

    public EmAprovacao(Orcamento orcamento) {
        super(orcamento);
    }

    @Override
    public double aplicaDesconto() {
        throw new OperacaoNaoPermitadaRuntimeException();
    }

    @Override
    public void emAprovacao() {
        throw new OperacaoNaoPermitadaRuntimeException();
    }

    @Override
    public void aprovado() {
        orcamento.setEstadoOrcamento(new Aprovado(orcamento));
    }

    @Override
    public void reprovado() {
        orcamento.setEstadoOrcamento(new Reprovado(orcamento));
    }

    @Override
    public void finalizado() {
        throw new OperacaoNaoPermitadaRuntimeException();
    }
}
