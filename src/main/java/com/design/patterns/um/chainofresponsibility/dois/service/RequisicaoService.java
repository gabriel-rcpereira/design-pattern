package com.design.patterns.um.chainofresponsibility.dois.service;

import com.design.patterns.um.chainofresponsibility.dois.model.Formato;

public class RequisicaoService {

    private Formato formato;

    public RequisicaoService(Formato formato) {
        this.formato = formato;
    }

    public Formato getFormato() {
        return formato;
    }
}
