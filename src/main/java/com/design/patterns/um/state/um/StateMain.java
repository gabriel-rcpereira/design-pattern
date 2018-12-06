package com.design.patterns.um.state.um;

import com.design.patterns.um.state.um.model.Orcamento;
import com.design.patterns.um.state.um.service.OrcamentoService;

public class StateMain {
    public static void main(String[] args){
        Orcamento orcamento = new Orcamento();
        orcamento.setValor(500.00);

        OrcamentoService orcamentoService = new OrcamentoService(orcamento);
        orcamento.getEstadoOrcamento().reprovado();
    }
}
