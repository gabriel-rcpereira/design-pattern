package com.design.patterns.um.state.um.service;

import com.design.patterns.um.state.um.exception.OperacaoNaoPermitadaRuntimeException;

public class EmAprovacao implements EstadoCarrinho {


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
        carrinhoService.estadoCarrinho = new Aprovado();
    }

    @Override
    public void reprovado(CarrinhoService carrinhoService) {
        carrinhoService.estadoCarrinho = new Reprovado();
    }

    @Override
    public void finalizado(CarrinhoService carrinhoService) {
        throw new OperacaoNaoPermitadaRuntimeException();
    }
}
