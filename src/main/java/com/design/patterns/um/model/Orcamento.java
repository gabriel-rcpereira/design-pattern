package com.design.patterns.um.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Orcamento {

    private List<Item> itens;

    public Orcamento() {
        itens = new ArrayList<>();
    }

    public double getTotalOrcamento() {
        return itens.stream().mapToDouble(Item::getValor).sum();
    }

    public List<Item> getItens() {
        return Collections.unmodifiableList(itens);
    }

    public void adicionaItem(Item item) {
        itens.add(item);
    }
}
