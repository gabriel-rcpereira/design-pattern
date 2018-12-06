package com.design.patterns.um.state.um.service;

import com.design.patterns.um.state.um.model.Orcamento;

public class CarrinhoService {

    protected Orcamento orcamento;
    protected EstadoCarrinho estadoCarrinho;

    public void incluirOrcamento(Orcamento orcamento) {
        this.orcamento = orcamento;
    }

    public CarrinhoService() {
        this.estadoCarrinho = new EmAprovacao();
    }

    public void aplicaDesconto(){
        estadoCarrinho.aplicaDesconto(this);
    }

    public void emAprovacao(){
        estadoCarrinho.emAprovacao(this);
    }

    public void aprovado(){
        estadoCarrinho.aprovado(this);
    }

    public void reprovado(){
        estadoCarrinho.reprovado(this);
    }

    public void finalizado(){
        estadoCarrinho.finalizado(this);
    }

    public double getTotalCarrinho(){
        return orcamento.getValor();
    }
}
