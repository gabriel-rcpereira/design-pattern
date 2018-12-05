package com.design.patterns.um.decorator.dois.model;

import java.time.LocalDate;

public class Conta {

    private int id;
    private double saldo;
    private LocalDate dataAbertura;

    public Conta() {
    }

    public Conta(int id, double saldo, LocalDate dataAbertura) {
        this.id = id;
        this.saldo = saldo;
        this.dataAbertura = dataAbertura;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public LocalDate getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(LocalDate dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Conta conta = (Conta) o;

        if (id != conta.id) return false;
        if (Double.compare(conta.saldo, saldo) != 0) return false;
        return dataAbertura.equals(conta.dataAbertura);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id;
        temp = Double.doubleToLongBits(saldo);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + dataAbertura.hashCode();
        return result;
    }
}
