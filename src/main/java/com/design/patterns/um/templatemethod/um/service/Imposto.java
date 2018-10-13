package com.design.patterns.um.templatemethod.um.service;

import com.design.patterns.um.model.Orcamento;

public interface Imposto {
    double calcula(Orcamento orcamento);
}
