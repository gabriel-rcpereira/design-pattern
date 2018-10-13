package com.design.patterns.um.chainofresponsibility.um.service;

import com.design.patterns.um.chainofresponsibility.um.model.TipoItem;
import com.design.patterns.um.model.Orcamento;

public class DescontoPorVendaCasadaService implements Desconto {

    private Desconto proximo;

    @Override
    public double desconta(Orcamento orcamento) {
        if (existeProdutoVendaCasada(TipoItem.CANETA, orcamento)
                && existeProdutoVendaCasada(TipoItem.LAPIS, orcamento)) {
            return orcamento.getTotalOrcamento() * 0.07;
        }
        else {
            return proximo.desconta(orcamento);
        }
    }

    @Override
    public void setProximo(Desconto proximo) {
        this.proximo = proximo;
    }

    private boolean existeProdutoVendaCasada(TipoItem tipoItem, Orcamento orcamento) {
        return orcamento.getItens().stream()
                .filter(filter -> filter.getDescricao().equals(tipoItem.name()))
                .count() > 0;
    }
}
