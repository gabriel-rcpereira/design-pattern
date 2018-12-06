package com.design.patterns.um.state.um.service;

import com.design.patterns.um.state.um.exception.OperacaoNaoPermitadaRuntimeException;
import com.design.patterns.um.state.um.model.Orcamento;

public class Aprovado implements EstadoCarrinho {

    @Override
    public void aplicaDesconto(CarrinhoService carrinhoService) {
        Orcamento orcamento = carrinhoService.orcamento;
        double valorOrcamento = orcamento.getValor();
        double valorDescontoAplicado = valorOrcamento - (valorOrcamento * 0.05);

        orcamento.setValor(valorDescontoAplicado);
        carrinhoService.orcamento = orcamento;
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
