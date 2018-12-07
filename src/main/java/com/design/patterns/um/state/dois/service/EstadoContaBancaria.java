package com.design.patterns.um.state.dois.service;

public interface EstadoContaBancaria {

    void sacar(OperacaoBancariaService operacaoBancariaService, double valor);
    void depositar(OperacaoBancariaService operacaoBancariaService, double valor);
}
