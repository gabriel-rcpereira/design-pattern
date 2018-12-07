package com.design.patterns.um.state.dois.model;

public class ContaBancaria {

    private double saldo;
    private double limiteChequeEspecial;

    public ContaBancaria(double saldo, double limiteChequeEspecial) {
        this.saldo = saldo;
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(double limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }
}
