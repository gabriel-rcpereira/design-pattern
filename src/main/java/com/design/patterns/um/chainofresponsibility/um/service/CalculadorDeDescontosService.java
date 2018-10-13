package com.design.patterns.um.chainofresponsibility.um.service;

import com.design.patterns.um.model.Orcamento;

public class CalculadorDeDescontosService {

    public double calcula(Orcamento orcamento) {
        Desconto d1 = new DescontoPorMaisDeCincoItensService();
        Desconto d2 = new DescontoPorMaisDeQuinhentosReaisService();
        Desconto d3 = new DescontoPorVendaCasadaService();

        d1.setProximo(d2);
        d2.setProximo(d3);
        d3.setProximo(new SemDescontoService());

        return d1.desconta(orcamento);
    }
}
