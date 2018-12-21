package com.design.patterns.um.observer.um;

import com.design.patterns.um.observer.um.builder.ItemNotaFiscalBuilder;
import com.design.patterns.um.observer.um.builder.NotaFiscalBuilder;
import com.design.patterns.um.observer.um.model.NotaFiscal;
import com.design.patterns.um.observer.um.service.EmailNotaFiscalService;
import com.design.patterns.um.observer.um.service.MultiplicadorNotaFiscalService;
import com.design.patterns.um.observer.um.service.NotaFiscalDaoService;
import com.design.patterns.um.observer.um.service.NotaFiscalService;

import java.time.LocalDate;

public class ObserverUmMain {

    public static void main(String[] args){

        NotaFiscal notaFiscal = new NotaFiscalBuilder()
                .withRazaoSocial("Teste RS 1")
                .withCnpj("1.1.1.1/0001-1")
                .withDataDeEmissao(LocalDate.now())
                .with(new ItemNotaFiscalBuilder().withNome("Item 1").withValor(100.00).build())
                .with(new ItemNotaFiscalBuilder().withNome("Item 2").withValor(200.00).build())
                .with(new ItemNotaFiscalBuilder().withNome("Item 3").withValor(300.00).build())
                .withObservacoes("Teste observação")
                .build();

        System.out.println(notaFiscal.getRazaoSocial());
        System.out.println(notaFiscal.getCnpj());
        System.out.println(notaFiscal.getDataDeEmissao());
        System.out.println(notaFiscal.getImpostos());
        System.out.println(notaFiscal.getValorBruto());

        NotaFiscalService notaFiscalService = new NotaFiscalService();
        notaFiscalService.addComplementoNotaFiscalService(new EmailNotaFiscalService());
        notaFiscalService.addComplementoNotaFiscalService(new NotaFiscalDaoService());
        notaFiscalService.addComplementoNotaFiscalService(new MultiplicadorNotaFiscalService(5.0));
        notaFiscalService.emitir(notaFiscal);
    }
}
