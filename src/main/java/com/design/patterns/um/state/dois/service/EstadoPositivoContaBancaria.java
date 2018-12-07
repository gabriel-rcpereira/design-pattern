package com.design.patterns.um.state.dois.service;

public class EstadoPositivoContaBancaria implements EstadoContaBancaria {

    @Override
    public void sacar(OperacaoBancariaService operacaoBancariaService, double valor) {
        // verificar se tem limite

        // retirar o valor da conta

        // definir o estado
    }

    @Override
    public void depositar(OperacaoBancariaService operacaoBancariaService, double valor) {

    }
}
