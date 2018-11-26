package com.design.patterns.um.templatemethod.dois.model;

public class Conta {

    private long id;
    private Banco banco;
    private Pessoa pessoa;
    private double saldo;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
