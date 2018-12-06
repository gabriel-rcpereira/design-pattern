package com.design.patterns.um.state.um.service;

import com.design.patterns.um.state.um.exception.OperacaoNaoPermitadaRuntimeException;

public class Reprovado implements EstadoCarrinho {

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
        carrinhoService.estadoCarrinho = new Finalizado();
    }
}
