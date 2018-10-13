package com.design.patterns.um.strategy.dois.service;

import com.design.patterns.um.strategy.dois.model.ContaBancaria;

import java.util.Random;

public class ArrojadoService implements InvestimentoService {

    private final double retornoUm = 0.05;
    private final double retornoDois = 0.03;
    private final double retornoTres = 0.006;

    @Override
    public double calcularRendimento(ContaBancaria contaBancaria) {
        return pegarTaxaInvestimento() * contaBancaria.getSaldo();
    }

    private double pegarTaxaInvestimento(){
        int chance = new Random().nextInt(10);

        if (chance <= 1){
            return retornoUm;
        } else if (chance > 1 && chance <= 4){
            return retornoDois;
        } else {
            return retornoTres;
        }
    }
}
