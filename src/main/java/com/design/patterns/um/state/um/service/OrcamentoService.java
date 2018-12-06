package com.design.patterns.um.state.um.service;

import com.design.patterns.um.state.um.model.Orcamento;

public class OrcamentoService {

    private Orcamento orcamento;

    public OrcamentoService(Orcamento orcamento) {
        this.orcamento = orcamento;
    }

    public void aplicaDesconto(){
        double valorDesconto = orcamento.getEstadoOrcamento().aplicaDesconto();
        orcamento.setValor(valorDesconto);
    }
}
