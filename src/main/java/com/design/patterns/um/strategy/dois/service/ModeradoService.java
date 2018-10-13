package com.design.patterns.um.strategy.dois.service;

import com.design.patterns.um.strategy.dois.model.ContaBancaria;

import java.util.Random;

public class ModeradoService implements InvestimentoService {

    private final double retornoUm = 0.025;
    private final double retornoDois = 0.007;

    @Override
    public double calcularRendimento(ContaBancaria contaBancaria) {
        return pegarTaxaInvestimento() * contaBancaria.getSaldo();
    }

    private double pegarTaxaInvestimento(){
        int chance = new Random().nextInt(1);
        return (chance == 0 ? retornoUm : retornoDois);
    }
}
