package com.design.patterns.um.chainofresponsibility.dois.service;

import com.design.patterns.um.chainofresponsibility.dois.model.Conta;
import com.design.patterns.um.chainofresponsibility.dois.model.Formato;

public class CadeiaDeConversorService {

    public String converterConta(Conta conta, Formato formato) {
        RequisicaoService requesicao = new RequisicaoService(formato);

        Resposta r3 = new PorcentoService();
        Resposta r2 = new CsvService(r3);
        Resposta r1 = new XmlService(r2);

        return r1.responde(requesicao, conta);
    }
}
