package com.design.patterns.um.state.um.service;

public interface EstadoCarrinho {

    void aplicaDesconto(CarrinhoService carrinhoService);
    void emAprovacao(CarrinhoService carrinhoService);
    void aprovado(CarrinhoService carrinhoService);
    void reprovado(CarrinhoService carrinhoService);
    void finalizado(CarrinhoService carrinhoService);
}
