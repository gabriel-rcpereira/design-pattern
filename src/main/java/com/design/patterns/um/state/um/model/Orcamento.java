package com.design.patterns.um.state.um.model;

import com.design.patterns.um.state.um.model.state.EstadoOrcamento;

public class Orcamento {

    private double valor;
    private EstadoOrcamento estadoOrcamento;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    protected EstadoOrcamento getEstadoOrcamento() {
        return estadoOrcamento;
    }

    protected void setEstadoOrcamento(EstadoOrcamento estadoOrcamento) {
        this.estadoOrcamento = estadoOrcamento;
    }
}
