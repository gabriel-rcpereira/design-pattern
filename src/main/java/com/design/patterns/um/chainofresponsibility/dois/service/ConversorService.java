package com.design.patterns.um.chainofresponsibility.dois.service;

import com.design.patterns.um.chainofresponsibility.dois.model.Formato;

import java.util.ArrayList;
import java.util.List;

public class ConversorService {

    private List<Object[]> linhas;
    private static final String SEPARADOR_CSV = ";";
    private static final String SEPARADOR_PORCENTO = "%";

    public ConversorService() {
        this.linhas = new ArrayList<Object[]>();
    }

    private void appendLine(Object[] lines) {
        this.linhas.add(lines);
    }

    private String build(String separador) {
        StringBuilder stringBuilder = new StringBuilder();
        linhas.forEach(linha -> {
            for (Object palavra : linha) {
                stringBuilder.append(palavra);
                stringBuilder.append(separador);
            }
            stringBuilder.append(System.lineSeparator());
        });
        return String.valueOf(stringBuilder);
    }

    public static class Builder {

        ConversorService conversorService = new ConversorService();

        public String buildToCsv() {
            return conversorService.build(SEPARADOR_CSV);
        }

        public String buildToPorcento() {
            return conversorService.build(SEPARADOR_PORCENTO);
        }

        public Builder append(Object[] linha) {
            conversorService.appendLine(linha);
            return this;
        }
    }
}
