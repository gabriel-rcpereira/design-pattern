package com.design.patterns.um.state.dois.service;

import com.design.patterns.um.state.dois.exception.SaqueNaoPermitidoRuntimeException;
import com.design.patterns.um.state.dois.model.ContaBancaria;

public class EstadoNegativoContaBancaria implements EstadoContaBancaria {

    private ContaBancaria contaBancaria;

    @Override
    public void sacar(OperacaoBancariaService operacaoBancariaService, double valor) {
        this.contaBancaria = operacaoBancariaService.contaBancaria;
        sacarDinheiroConta(valor);
    }

    @Override
    public void depositar(OperacaoBancariaService operacaoBancariaService, double valor) {
        this.contaBancaria = operacaoBancariaService.contaBancaria;
        realizarDeposito(valor, operacaoBancariaService);
    }

    private void sacarDinheiroConta(double valor) {
        checarLimiteDisponivelParaSaque(valor);
        setSaldoContaBancariaDepoisDoSaque(valor);
    }

    private void setSaldoContaBancariaDepoisDoSaque(double valor) {
        double saldoDepoisDoSaque = getCalculoDoSaldoDepoisDoSaque(valor, this.contaBancaria.getSaldo());
        this.contaBancaria.setSaldo(saldoDepoisDoSaque);
    }

    private double getCalculoDoSaldoDepoisDoSaque(double valor, double saldo) {
        return saldo - valor;
    }

    private void checarLimiteDisponivelParaSaque(double valor) {
        double limiteSaqueContaBancaria = getLimiteDisponivelSaqueContaBancaria();
        if (valor > limiteSaqueContaBancaria) {
            throw new SaqueNaoPermitidoRuntimeException();
        }
    }

    private double getLimiteDisponivelSaqueContaBancaria() {
        return this.contaBancaria.getSaldo() + this.contaBancaria.getLimiteChequeEspecial();
    }

    private void realizarDeposito(double valor, OperacaoBancariaService operacaoBancariaService) {
        ContaBancaria contaBancaria = this.contaBancaria;
        contaBancaria.setSaldo(getValorDepositadoDescontandoTarifa(valor));
        setContaBancariaEstaPositiva(operacaoBancariaService);
    }

    private void setContaBancariaEstaPositiva(OperacaoBancariaService operacaoBancariaService) {
        if (!isSaldoPositivo(this.contaBancaria)){
            return;
        }
        setEstadoPositivoContaBancaria(operacaoBancariaService);
    }

    private void setEstadoPositivoContaBancaria(OperacaoBancariaService operacaoBancariaService) {
        operacaoBancariaService.estadoContaBancaria = new EstadoPositivoContaBancaria();
    }

    private boolean isSaldoPositivo(ContaBancaria contaBancaria) {
        return contaBancaria.getSaldo() > 0;
    }

    private double getValorDepositadoDescontandoTarifa(double valor) {
        return valor - (valor * 0.05);
    }
}
