package com.design.patterns.um.state.dois.service;

import com.design.patterns.um.state.dois.model.ContaBancaria;

public class EstadoPositivoContaBancaria implements EstadoContaBancaria {

    private ContaBancaria contaBancaria;
    private CalcularOperacaoBancariaService calcularOperacaoBancariaService;

    public EstadoPositivoContaBancaria(){
        this.calcularOperacaoBancariaService = new CalcularOperacaoBancariaService();
    }

    @Override
    public void sacar(OperacaoBancariaService operacaoBancariaService, double valor) {
        this.contaBancaria = operacaoBancariaService.contaBancaria;
        sacarDinheiroConta(valor, operacaoBancariaService);
    }

    @Override
    public void depositar(OperacaoBancariaService operacaoBancariaService, double valor) {
        this.contaBancaria = operacaoBancariaService.contaBancaria;
        realizarDeposito(valor);
    }

    private void realizarDeposito(double valorDeposito) {
        updateSaldoContaBancariaDepoisDeposito(valorDeposito);
    }

    private void updateSaldoContaBancariaDepoisDeposito(double valorDeposito) {
        contaBancaria.setSaldo(contaBancaria.getSaldo() + getValorDepositadoDescontandoTarifa(valorDeposito));
    }

    private double getValorDepositadoDescontandoTarifa(double valor) {
        return valor - (valor * 0.02);
    }

    private void sacarDinheiroConta(double valor, OperacaoBancariaService operacaoBancariaService) {
        this.calcularOperacaoBancariaService.checarLimiteDisponivelParaSaque(valor,
                contaBancaria.getSaldo(),
                contaBancaria.getLimiteChequeEspecial());
        setSaldoContaBancariaDepoisDoSaque(valor);
        setEstadoContaBancaria(operacaoBancariaService);
    }

    private void setSaldoContaBancariaDepoisDoSaque(double valorSaque) {
        double saldoDepoisDoSaque = this.calcularOperacaoBancariaService.getCalculoDoSaldoDepoisDoSaque(valorSaque,
                this.contaBancaria.getSaldo());
        this.contaBancaria.setSaldo(valorSaque);
    }

    private void setEstadoContaBancaria(OperacaoBancariaService operacaoBancariaService) {
        if (this.contaBancaria.getSaldo() < 0){
            setContaBancariaEstadoNegativo(operacaoBancariaService);
        }
    }

    private void setContaBancariaEstadoNegativo(OperacaoBancariaService operacaoBancariaService) {
        operacaoBancariaService.estadoContaBancaria = new EstadoNegativoContaBancaria();
    }
}
