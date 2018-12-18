package com.design.patterns.um.observer.um.service;

import com.design.patterns.um.observer.um.model.NotaFiscal;

public class NotaFiscalDaoService implements ComplementoNotaFiscalService {
    @Override
    public void executa(NotaFiscal notaFiscal) {
        System.out.println("Nota fiscal persistida");
    }
}
