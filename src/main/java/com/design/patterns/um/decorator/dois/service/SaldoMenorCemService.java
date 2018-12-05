package com.design.patterns.um.decorator.dois.service;

import com.design.patterns.um.decorator.dois.model.Conta;

import java.util.List;
import java.util.stream.Collectors;

public class SaldoMenorCemService extends Filtro {

    public SaldoMenorCemService() {
    }

    public SaldoMenorCemService(Filtro filtroDecorator) {
        super(filtroDecorator);
    }

    @Override
    public List<Conta> aplicar(List<Conta> contas) {
        List<Conta> contasSaldoMenorCem = contas.stream()
                .filter(conta -> conta.getSaldo() < 100.00)
                .collect(Collectors.toList());

        return  mesclar(contasSaldoMenorCem, aplicarDecorator(contas));
    }
}
