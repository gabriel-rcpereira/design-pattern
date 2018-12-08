package com.design.patterns.um.state.dois.service;

import com.design.patterns.um.state.dois.model.ContaBancaria;

public class EstadoNegativoContaBancaria implements EstadoContaBancaria {

    private ContaBancaria contaBancaria;
    private CalcularOperacaoBancariaService calcularOperacaoBancariaService;

    public EstadoNegativoContaBancaria(){
        this.calcularOperacaoBancariaService = new CalcularOperacaoBancariaService();
    }

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
        this.calcularOperacaoBancariaService.checarLimiteDisponivelParaSaque(valor,
                contaBancaria.getSaldo(),
                contaBancaria.getLimiteChequeEspecial());
        setSaldoContaBancariaDepoisDoSaque(valor);
    }

    private void setSaldoContaBancariaDepoisDoSaque(double valorSaque) {
        double saldoDepoisDoSaque = this.calcularOperacaoBancariaService.getCalculoDoSaldoDepoisDoSaque(valorSaque,
                this.contaBancaria.getSaldo());
        this.contaBancaria.setSaldo(saldoDepoisDoSaque);
    }

    private void realizarDeposito(double valorDeposito, OperacaoBancariaService operacaoBancariaService) {
        updateSaldoContaBancariaDepoisDeposito(valorDeposito);
        setEstadoContaBancaria(operacaoBancariaService);
    }

    private void updateSaldoContaBancariaDepoisDeposito(double valorDeposito) {
        contaBancaria.setSaldo(contaBancaria.getSaldo() + getValorDepositadoDescontandoTarifa(valorDeposito));
    }

    private void setEstadoContaBancaria(OperacaoBancariaService operacaoBancariaService) {
        if (!isSaldoPositivo()){
            return;
        }
        setEstadoPositivoContaBancaria(operacaoBancariaService);
    }

    private void setEstadoPositivoContaBancaria(OperacaoBancariaService operacaoBancariaService) {
        operacaoBancariaService.estadoContaBancaria = new EstadoPositivoContaBancaria();
    }

    private boolean isSaldoPositivo() {
        return contaBancaria.getSaldo() > 0;
    }

    private double getValorDepositadoDescontandoTarifa(double valor) {
        return valor - (valor * 0.05);
    }
}
