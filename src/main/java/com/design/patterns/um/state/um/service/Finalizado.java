package com.design.patterns.um.state.um.service;

import com.design.patterns.um.state.um.exception.OperacaoNaoPermitadaRuntimeException;
import com.design.patterns.um.state.um.model.Orcamento;

public class Finalizado implements EstadoCarrinho {

    @Override
    public void aplicaDesconto(CarrinhoService carrinhoService) {
        throw new OperacaoNaoPermitadaRuntimeException();
    }

    @Override
    public void emAprovacao(CarrinhoService carrinhoService) {
        throw new OperacaoNaoPermitadaRuntimeException();
    }

    @Override
    public void aprovado(CarrinhoService carrinhoService) {
        throw new OperacaoNaoPermitadaRuntimeException();
    }

    @Override
    public void reprovado(CarrinhoService carrinhoService) {
        throw new OperacaoNaoPermitadaRuntimeException();
    }

    @Override
    public void finalizado(CarrinhoService carrinhoService) {
        throw new OperacaoNaoPermitadaRuntimeException();
    }
}
