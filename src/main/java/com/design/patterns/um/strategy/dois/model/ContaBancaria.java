package com.design.patterns.um.strategy.dois.model;

public class ContaBancaria {

    private long numero;
    private double saldo;

    public ContaBancaria(long numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
