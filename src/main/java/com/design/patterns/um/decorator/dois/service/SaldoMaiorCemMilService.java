package com.design.patterns.um.decorator.dois.service;

import com.design.patterns.um.decorator.dois.model.Conta;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class SaldoMaiorCemMilService extends Filtro {

    public SaldoMaiorCemMilService() {
    }

    public SaldoMaiorCemMilService(Filtro filtroDecorator) {
        super(filtroDecorator);
    }

    @Override
    public List<Conta> aplicar(List<Conta> contas) {
        List<Conta> contasSaldoMaiorCemMil = contas.stream()
                .filter(conta -> conta.getSaldo() > 100000.00)
                .collect(Collectors.toList());

        return  mesclar(contasSaldoMaiorCemMil, aplicarDecorator(contas));
    }
}
