package com.design.patterns.um.builderpattern.um;

import com.design.patterns.um.builderpattern.um.builder.ItemNotaFiscalBuilder;
import com.design.patterns.um.builderpattern.um.builder.NotaFiscalBuilder;
import com.design.patterns.um.builderpattern.um.model.ItemDaNota;
import com.design.patterns.um.builderpattern.um.model.NotaFiscal;

import java.time.LocalDate;

public class BuilderUmMain {

    public static void main(String[] args){

        NotaFiscal notaFiscal = new NotaFiscalBuilder()
                .withRazaoSocial("Teste RS 1")
                .withCnpj("1.1.1.1/0001-1")
                .withDataDeEmissao(LocalDate.now())
                .withItem(new ItemNotaFiscalBuilder().withNome("Item 1").withValor(100.00).build())
                .withItem(new ItemNotaFiscalBuilder().withNome("Item 2").withValor(200.00).build())
                .withItem(new ItemNotaFiscalBuilder().withNome("Item 3").withValor(300.00).build())
                .withObservacoes("Teste observação")
                .build();

        System.out.println(notaFiscal.getRazaoSocial());
        System.out.println(notaFiscal.getCnpj());
        System.out.println(notaFiscal.getDataDeEmissao());
        System.out.println(notaFiscal.getImpostos());
        System.out.println(notaFiscal.getValorBruto());
    }
}
