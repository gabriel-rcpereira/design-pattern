package com.design.patterns.um.chainofresponsibility.dois.model;

public class Conta {

    private String titular;
    private Double saldo;

    public Conta(String titular, Double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public Double getSaldo() {
        return saldo;
    }
}
