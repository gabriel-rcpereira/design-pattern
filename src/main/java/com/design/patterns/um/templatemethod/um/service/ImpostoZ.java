package com.design.patterns.um.templatemethod.um.service;

import com.design.patterns.um.model.Item;
import com.design.patterns.um.model.Orcamento;

import java.util.*;
import java.util.stream.Collectors;

public class ImpostoZ extends TemplateDeImpostoCondicional {
    @Override
    protected boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
        return isExisteItemDuplicado(orcamento);
    }

    private boolean isExisteItemDuplicado(Orcamento orcamento) {
        Set<String> tempSet = new HashSet();
        Set<String> duplicates = new HashSet();

        orcamento.getItens().forEach( item -> {
            if (!tempSet.add(item.getDescricao())) {
                duplicates.add(item.getDescricao());
            }
        });

        return (duplicates.size() > 0);
    }

    @Override
    protected double maximaTaxacao(Orcamento orcamento) {
        return orcamento.getTotalOrcamento() * 0.13;
    }

    @Override
    protected double minimaTaxacao(Orcamento orcamento) {
        return orcamento.getTotalOrcamento() * 0.01;
    }
}
