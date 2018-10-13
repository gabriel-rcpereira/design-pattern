package com.design.patterns.um.strategy.um.service;

import com.design.patterns.um.model.Orcamento;

public class IssService implements ImpostoService {

    private double aliquota = 6;

    @Override
    public double calculaImposto(Orcamento orcamento) {
        return (orcamento.getTotalOrcamento() * this.getPercentualImposto());
    }

    @Override
    public String getNomeImposto() {
        return "ISS";
    }

    private double getPercentualImposto() {
        return aliquota/100;
    }
}
