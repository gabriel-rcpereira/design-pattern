package com.design.patterns.um.strategy.um.service;

import com.design.patterns.um.model.Orcamento;

public class IccService implements ImpostoService {

    private final double aliquotaFaixaUm = 5;
    private final double aliquotaFaixaDois = 7;
    private final double aliquotaFaixaTres = 8;

    @Override
    public double calculaImposto(Orcamento orcamento) {
        double aliquota = 0;

        if (orcamento.getTotalOrcamento() <= 1000) {
            aliquota = aliquotaFaixaUm;
        } else if (orcamento.getTotalOrcamento() > 1000
                && orcamento.getTotalOrcamento() <= 3000) {
            aliquota = aliquotaFaixaDois;
        } else {
            aliquota = aliquotaFaixaTres;
        }

        return (orcamento.getTotalOrcamento() * this.getPercentualImposto(aliquota));
    }

    @Override
    public String getNomeImposto() {
        return "ICCC";
    }

    private double getPercentualImposto(double aliquota) {
        return (aliquota/100);
    }
}
