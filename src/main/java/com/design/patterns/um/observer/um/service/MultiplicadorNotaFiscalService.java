package com.design.patterns.um.observer.um.service;

import com.design.patterns.um.observer.um.model.NotaFiscal;

public class MultiplicadorNotaFiscalService implements ComplementoNotaFiscalService {

    private double fatorMultiplicador;

    public MultiplicadorNotaFiscalService(double fatorMultiplicador) {
        this.fatorMultiplicador = fatorMultiplicador;
    }

    @Override
    public void executa(NotaFiscal notaFiscal) {
        System.out.println(notaFiscal.getValorBruto() * this.fatorMultiplicador);
    }
}
