package com.design.patterns.um.builderpattern.um.builder;

import com.design.patterns.um.builderpattern.um.model.ItemDaNota;
import com.design.patterns.um.builderpattern.um.model.NotaFiscal;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class NotaFiscalBuilder {

    private String razaoSocial;
    private String cnpj;
    private LocalDate dataDeEmissao;
    private double valorBruto;
    private double impostos;
    public List<ItemDaNota> itens;
    public String observacoes;

    public NotaFiscalBuilder() {
        this.dataDeEmissao = LocalDate.now();
        this.itens = new ArrayList<>();
    }

    public NotaFiscalBuilder withRazaoSocial(String razaoSocial){
        this.razaoSocial = razaoSocial;
        return this;
    }

    public NotaFiscalBuilder withCnpj(String cnpj){
        this.cnpj = cnpj;
        return this;
    }

    public NotaFiscalBuilder withDataDeEmissao(LocalDate dataDeEmissao){
        this.dataDeEmissao = dataDeEmissao;
        return this;
    }

    public NotaFiscalBuilder with(ItemDaNota itemDaNota){
        this.itens.add(itemDaNota);
        this.valorBruto += itemDaNota.getValor();
        this.impostos += (itemDaNota.getValor() * 0.05);

        return this;
    }

    public NotaFiscalBuilder withObservacoes(String observacoes){
        this.observacoes = observacoes;
        return this;
    }

    public NotaFiscal build(){
        return new NotaFiscal(this.razaoSocial,
                this.cnpj,
                this.dataDeEmissao,
                this.valorBruto,
                this.impostos,
                this.itens,
                this.observacoes);
    }
}
