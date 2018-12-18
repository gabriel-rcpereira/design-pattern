package com.design.patterns.um.observer.um.service;

import com.design.patterns.um.observer.um.model.NotaFiscal;

import java.util.HashMap;
import java.util.Map;

public class NotaFiscalService {

    private Map<Integer, ComplementoNotaFiscalService> complementosNotaFiscalService;

    public NotaFiscalService(){
        this.complementosNotaFiscalService = new HashMap<>();
    }

    public void addComplementoNotaFiscalService(ComplementoNotaFiscalService complementoNotaFiscalService){
        this.complementosNotaFiscalService.put(getIndex(), complementoNotaFiscalService);
    }

    private int getIndex() {
        return this.complementosNotaFiscalService.size() == 0 ? 0 : this.complementosNotaFiscalService.size() + 1;
    }

    public void emitir(NotaFiscal notaFiscal){
        System.out.println("Nota fiscal emitida");

        this.complementosNotaFiscalService.keySet().stream().forEach(key ->
                this.complementosNotaFiscalService.get(key)
                        .executa(notaFiscal));
    }
}
