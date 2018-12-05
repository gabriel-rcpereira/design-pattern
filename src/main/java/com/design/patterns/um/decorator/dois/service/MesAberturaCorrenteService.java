package com.design.patterns.um.decorator.dois.service;

import com.design.patterns.um.decorator.dois.model.Conta;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class MesAberturaCorrenteService extends Filtro {

    public MesAberturaCorrenteService() {
    }

    public MesAberturaCorrenteService(Filtro filtroDecorator) {
        super(filtroDecorator);
    }

    @Override
    public List<Conta> aplicar(List<Conta> contas) {
        List<Conta> contasMesAberturaCorrente = contas.stream()
                .filter(conta -> conta.getDataAbertura().getMonth().equals(LocalDate.now().getMonth()))
                .collect(Collectors.toList());

        return  mesclar(contasMesAberturaCorrente, aplicarDecorator(contas));
    }

}
