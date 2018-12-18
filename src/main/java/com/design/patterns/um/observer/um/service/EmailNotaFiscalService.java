package com.design.patterns.um.observer.um.service;

import com.design.patterns.um.observer.um.model.NotaFiscal;

public class EmailNotaFiscalService implements ComplementoNotaFiscalService {
    @Override
    public void executa(NotaFiscal notaFiscal) {
        System.out.println("Nota fiscal enviada por e-mail");
    }
}
