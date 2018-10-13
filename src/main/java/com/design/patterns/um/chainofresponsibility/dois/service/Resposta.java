package com.design.patterns.um.chainofresponsibility.dois.service;

import com.design.patterns.um.chainofresponsibility.dois.model.Conta;

public interface Resposta {

    String responde(RequisicaoService req, Conta conta);
}
