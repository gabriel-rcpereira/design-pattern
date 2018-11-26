package com.design.patterns.um.templatemethod.dois.service;

import com.design.patterns.um.templatemethod.dois.model.Conta;

import java.time.LocalDate;
import java.util.List;

public class RelatorioComplexo extends Relatorio {

    public RelatorioComplexo(List<Conta> contas) {
        super(contas);
    }

    @Override
    protected String cabecalho(Conta conta) {
        return "Banco: " + conta.getBanco().getName() + " Telefone: " + conta.getBanco().getTelefone() +
                " Endereço: " + conta.getBanco().getEndereco();
    }

    @Override
    protected String corpo(Conta conta) {
        return "Titular: " + conta.getBanco().getName()
                + " Agencia: " + conta.getBanco().getAgencia()
                + " Conta: " + conta.getId()
                + " Saldo: " + conta.getSaldo();
    }

    @Override
    protected String rodape(Conta conta) {
        return "Email: " + conta.getBanco().getEmail() + " Data Atual: " + LocalDate.now();
    }
}
