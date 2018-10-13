package com.design.patterns.um.chainofresponsibility.dois;

import com.design.patterns.um.chainofresponsibility.dois.model.Conta;
import com.design.patterns.um.chainofresponsibility.dois.model.Formato;
import com.design.patterns.um.chainofresponsibility.dois.service.CadeiaDeConversorService;

public class CadeiaConversorMain {

    public static void main(String[] objects){
        CadeiaDeConversorService cadeiaDeConversorService = new CadeiaDeConversorService();
        System.out.println(cadeiaDeConversorService.converterConta(
                new Conta("Gabriel Pereira", 10000.00), Formato.XML));
    }
}
