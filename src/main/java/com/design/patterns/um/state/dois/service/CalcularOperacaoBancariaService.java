package com.design.patterns.um.state.dois.service;

import com.design.patterns.um.state.dois.exception.EstourouLimiteDeCreditoDisponivelRuntimeException;

public class CalcularOperacaoBancariaService {

    public double getCalculoDoSaldoDepoisDoSaque(double valor, double saldo) {
        return saldo - valor;
    }

    public void checarLimiteDisponivelParaSaque(double valor, double saldo, double valorLimiteChequeEspec) {
        double limiteSaqueContaBancaria = getLimiteDisponivelSaqueContaBancaria(saldo, valorLimiteChequeEspec);
        checarContaPossuiLimiteDisponivelSaque(valor, limiteSaqueContaBancaria);
    }

    private void checarContaPossuiLimiteDisponivelSaque(double valor, double limiteSaqueContaBancaria) {
        if (valor > limiteSaqueContaBancaria) {
            throw new EstourouLimiteDeCreditoDisponivelRuntimeException();
        }
    }

    private double getLimiteDisponivelSaqueContaBancaria(double saldo, double valorLimiteChequeEspec) {
        return saldo + valorLimiteChequeEspec;
    }
}
