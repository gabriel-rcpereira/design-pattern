package com.design.patterns.um.templatemethod.um;

import com.design.patterns.um.chainofresponsibility.um.model.TipoItem;
import com.design.patterns.um.model.Item;
import com.design.patterns.um.model.Orcamento;
import com.design.patterns.um.templatemethod.um.service.Imposto;
import com.design.patterns.um.templatemethod.um.service.ImpostoX;
import com.design.patterns.um.templatemethod.um.service.ImpostoY;
import com.design.patterns.um.templatemethod.um.service.ImpostoZ;

public class TemplateMethodMain {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento();
        orcamento.adicionaItem(new Item(TipoItem.APONTADOR.name(), 100.00));
        orcamento.adicionaItem(new Item(TipoItem.MOCHILA.name(), 200.00));
        orcamento.adicionaItem(new Item(TipoItem.BORRACHA.name(), 250.00));
        orcamento.adicionaItem(new Item(TipoItem.CADERNO.name(), 100.00));

        System.out.println("Total orçamento: " + orcamento.getTotalOrcamento());

        Imposto impostoX = new ImpostoX();
        System.out.println("Valor imposto X: " + impostoX.calcula(orcamento));

        Imposto impostoY = new ImpostoY();
        System.out.println("Valor imposto Y: " + impostoY.calcula(orcamento));

        Imposto impostoZ = new ImpostoZ();
        System.out.println("Valor imposto Z: " + impostoZ.calcula(orcamento));
    }
}
