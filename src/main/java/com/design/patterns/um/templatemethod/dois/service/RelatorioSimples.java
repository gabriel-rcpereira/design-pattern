package com.design.patterns.um.templatemethod.dois.service;

import com.design.patterns.um.templatemethod.dois.model.Conta;

import java.util.List;

public class RelatorioSimples extends Relatorio {

    public RelatorioSimples(List<Conta> conta) {
        super(conta);
    }

    @Override
    protected String cabecalho(Conta conta) {
        return getDadosDoBanco(conta);
    }

    @Override
    protected String corpo(Conta conta) {
        return "Titular: " + conta.getBanco().getName() + " Saldo: " + conta.getSaldo();
    }

    @Override
    protected String rodape(Conta conta) {
        return getDadosDoBanco(conta);
    }

    private String getDadosDoBanco(Conta conta) {
        return "Banco: "
                + conta.getBanco().getName() + " Telefone: "
                + conta.getBanco().getTelefone();
    }
}
