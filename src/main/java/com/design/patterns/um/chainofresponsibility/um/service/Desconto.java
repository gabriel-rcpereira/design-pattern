package com.design.patterns.um.chainofresponsibility.um.service;

import com.design.patterns.um.model.Orcamento;

public interface Desconto {

    double desconta(Orcamento orcamento);
    void setProximo(Desconto proximo);
}
