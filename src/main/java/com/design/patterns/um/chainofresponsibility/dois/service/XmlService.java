package com.design.patterns.um.chainofresponsibility.dois.service;

import com.design.patterns.um.chainofresponsibility.dois.model.Conta;
import com.design.patterns.um.chainofresponsibility.dois.model.Formato;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.util.Optional;

public class XmlService implements Resposta {

    private Resposta proximo;

    public XmlService() {
    }

    public XmlService(Resposta proximo) {
        this.proximo = proximo;
    }

    @Override
    public String responde(RequisicaoService req, Conta conta) {
        if (req.getFormato().equals(Formato.XML)){
            return converterParaXml(conta);
        } else if (Optional.ofNullable(this.proximo).isPresent()) {
            return this.proximo.responde(req, conta);
        } else {
            throw new RuntimeException("Nenhuma condição satisfeita");
        }
    }

    private String converterParaXml(Conta conta) {
        String xml = null;
        try {
            xml = new XmlMapper().writeValueAsString(conta);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return xml;
    }
}
