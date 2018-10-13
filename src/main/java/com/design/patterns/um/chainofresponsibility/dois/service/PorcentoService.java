package com.design.patterns.um.chainofresponsibility.dois.service;

import com.design.patterns.um.chainofresponsibility.dois.model.Conta;
import com.design.patterns.um.chainofresponsibility.dois.model.Formato;

import java.util.Optional;

public class PorcentoService implements Resposta {

    private Resposta proximo;

    public PorcentoService() {
    }

    public PorcentoService(Resposta proximo) {
        this.proximo = proximo;
    }

    @Override
    public String responde(RequisicaoService req, Conta conta) {
        if (req.getFormato().equals(Formato.PORCENTO)) {
            return converterParaPorcento(conta);
        } else if (Optional.ofNullable(this.proximo).isPresent()) {
            return this.proximo.responde(req, conta);
        } else {
            throw new RuntimeException("Nenhuma condição satisfeita");
        }
    }

    private String converterParaPorcento(Conta conta) {
        return new ConversorService.Builder()
                .append(new Object[]{"titular", "saldo"})
                .append(new Object[]{conta.getTitular(), conta.getSaldo()})
                .buildToPorcento();
    }
}
