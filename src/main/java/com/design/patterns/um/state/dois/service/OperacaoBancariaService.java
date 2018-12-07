package com.design.patterns.um.state.dois.service;

import com.design.patterns.um.state.dois.model.ContaBancaria;

public class OperacaoBancariaService {

    protected ContaBancaria contaBancaria;
    protected EstadoContaBancaria estadoContaBancaria;

    public OperacaoBancariaService(ContaBancaria contaBancaria) {
        this.contaBancaria = contaBancaria;
        if (this.contaBancaria.getSaldo() < 0.0){
            this.estadoContaBancaria = new EstadoNegativoContaBancaria();
        } else {
            this.estadoContaBancaria = new EstadoPositivoContaBancaria();
        }
    }

    public void sacar(double valor){
        this.estadoContaBancaria.sacar(this, valor);
    }

    public void depositar(double valor){
        this.estadoContaBancaria.depositar(this, valor);
    }

    public double getSaldoAtualContaBancaria(){
        return contaBancaria.getSaldo();
    }
}
