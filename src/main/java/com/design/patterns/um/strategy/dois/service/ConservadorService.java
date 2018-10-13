package com.design.patterns.um.strategy.dois.service;

import com.design.patterns.um.strategy.dois.model.ContaBancaria;

public class ConservadorService implements InvestimentoService {

    private final double retornoUm = 0.008;

    @Override
    public double calcularRendimento(ContaBancaria contaBancaria) {
        return retornoUm * contaBancaria.getSaldo();
    }
}
