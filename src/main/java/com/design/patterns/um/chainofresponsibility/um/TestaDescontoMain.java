package com.design.patterns.um.chainofresponsibility.um;

import com.design.patterns.um.chainofresponsibility.um.model.TipoItem;
import com.design.patterns.um.chainofresponsibility.um.service.CalculadorDeDescontosService;
import com.design.patterns.um.model.Item;
import com.design.patterns.um.model.Orcamento;

public class TestaDescontoMain {
    public static void main(String[] args) {
        CalculadorDeDescontosService calculador = new CalculadorDeDescontosService();

        Orcamento orcamento = new Orcamento();
        orcamento.adicionaItem(new Item(TipoItem.CANETA.name(), 150.0));
        orcamento.adicionaItem(new Item(TipoItem.BORRACHA.name(), 150.0));
        orcamento.adicionaItem(new Item(TipoItem.LAPIS.name(), 50.0));
//        orcamento.adicionaItem(new Item(TipoItem.MOCHILA.name(), 150.0));
//        orcamento.adicionaItem(new Item(TipoItem.CADERNO.name(), 40.0));
//        orcamento.adicionaItem(new Item(TipoItem.APONTADOR.name(), 30.0));

        double desconto = calculador.calcula(orcamento);
        System.out.println(desconto);
    }
}
