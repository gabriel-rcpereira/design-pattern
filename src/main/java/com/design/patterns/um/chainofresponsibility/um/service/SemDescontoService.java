package com.design.patterns.um.chainofresponsibility.um.service;

import com.design.patterns.um.model.Orcamento;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class SemDescontoService implements Desconto {

    @Override
    public double desconta(Orcamento orcamento) {
        return 0;
    }

    @Override
    public void setProximo(Desconto proximo) {
        throw new NotImplementedException();
    }
}
