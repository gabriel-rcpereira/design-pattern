package com.design.patterns.um.strategy.um.service;

import com.design.patterns.um.model.Orcamento;

public class IcmsService implements ImpostoService {

    private double aliquota = 5;

    @Override
    public double calculaImposto(Orcamento orcamento) {
        return (orcamento.getTotalOrcamento() * this.getPercentualImposto());
    }

    @Override
    public String getNomeImposto() {
        return "ICMS";
    }

    private double getPercentualImposto() {
        return (aliquota/100);
    }
}
