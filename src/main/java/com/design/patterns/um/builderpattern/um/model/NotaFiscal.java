package com.design.patterns.um.builderpattern.um.model;

import java.time.LocalDate;
import java.util.List;

public class NotaFiscal {

    private String razaoSocial;
    private String cnpj;
    private LocalDate dataDeEmissao;
    private double valorBruto;
    private double impostos;
    public List<ItemDaNota> itens;
    public String observacoes;

    public NotaFiscal(String razaoSocial,
                      String cnpj,
                      LocalDate dataDeEmissao,
                      double valorBruto,
                      double impostos,
                      List<ItemDaNota> itens,
                      String observacoes) {
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.dataDeEmissao = dataDeEmissao;
        this.valorBruto = valorBruto;
        this.impostos = impostos;
        this.itens = itens;
        this.observacoes = observacoes;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public LocalDate getDataDeEmissao() {
        return dataDeEmissao;
    }

    public double getValorBruto() {
        return valorBruto;
    }

    public double getImpostos() {
        return impostos;
    }

    public List<ItemDaNota> getItens() {
        return itens;
    }

    public String getObservacoes() {
        return observacoes;
    }
}
