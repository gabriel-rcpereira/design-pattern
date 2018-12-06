package com.design.patterns.um.state.um.model.state;

import com.design.patterns.um.state.um.exception.OperacaoNaoPermitadaRuntimeException;
import com.design.patterns.um.state.um.model.Orcamento;

public class Finalizado extends EstadoOrcamento {

    public Finalizado(Orcamento orcamento) {
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
        throw new OperacaoNaoPermitadaRuntimeException();
    }

    @Override
    public void reprovado() {
        throw new OperacaoNaoPermitadaRuntimeException();
    }

    @Override
    public void finalizado() {
        throw new OperacaoNaoPermitadaRuntimeException();
    }
}
