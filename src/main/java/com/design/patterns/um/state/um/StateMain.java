package com.design.patterns.um.state.um;

import com.design.patterns.um.state.um.exception.OperacaoNaoPermitadaRuntimeException;
import com.design.patterns.um.state.um.model.Orcamento;
import com.design.patterns.um.state.um.service.CarrinhoService;

public class StateMain {

    public static void main(String[] args){
        Orcamento orcamento = new Orcamento(500.0);

        executaFluxoAprovado(orcamento);
        executaFluxoReprovado(orcamento);
    }

    private static void executaFluxoReprovado(Orcamento orcamento) {
        System.out.println("FLUXO REPROVACAO");

        CarrinhoService carrinhoService = new CarrinhoService();
        carrinhoService.incluirOrcamento(orcamento);

        try {
            carrinhoService.aplicaDesconto();
        } catch (OperacaoNaoPermitadaRuntimeException e){
//            e.printStackTrace();
            System.out.println("Carrinho no estado Em Aprovação não pode aplicar desconto");
        }

        try {
            carrinhoService.finalizado();
        } catch (OperacaoNaoPermitadaRuntimeException e){
//            e.printStackTrace();
            System.out.println("Carrinho no estado Em Aprovação não pode ser Finalizado");
        }

        System.out.println("Reprovado");
        carrinhoService.reprovado();

        try {
            carrinhoService.emAprovacao();
        } catch (OperacaoNaoPermitadaRuntimeException e){
//            e.printStackTrace();
            System.out.println("Carrinho no estado Reprovado não pode voltar para Em Aprovacao");
        }

        try {
            carrinhoService.aprovado();
        } catch (OperacaoNaoPermitadaRuntimeException e){
//            e.printStackTrace();
            System.out.println("Carrinho no estado Aprovado não pode voltar ser Reprovado");
        }

        try {
            carrinhoService.aplicaDesconto();
        } catch (OperacaoNaoPermitadaRuntimeException e){
//            e.printStackTrace();
            System.out.println("Carrinho no estado Reprovado não pode aplicar desconto");
        }

        System.out.println("Finaliza");
        carrinhoService.finalizado();

        try {
            carrinhoService.aplicaDesconto();
        } catch (OperacaoNaoPermitadaRuntimeException e){
//            e.printStackTrace();
            System.out.println("Carrinho no estado Finalizado não pode aplicar desconto");
        }
    }

    private static void executaFluxoAprovado(Orcamento orcamento) {
        System.out.println("FLUXO APROVACAO");

        CarrinhoService carrinhoService = new CarrinhoService();
        carrinhoService.incluirOrcamento(orcamento);

        try {
            carrinhoService.aplicaDesconto();
        } catch (OperacaoNaoPermitadaRuntimeException e){
//            e.printStackTrace();
            System.out.println("Carrinho no estado Em Aprovação não pode aplicar desconto");
        }

        try {
            carrinhoService.finalizado();
        } catch (OperacaoNaoPermitadaRuntimeException e){
//            e.printStackTrace();
            System.out.println("Carrinho no estado Em Aprovação não pode ser Finalizado");
        }

        System.out.println("Aprovado");
        carrinhoService.aprovado();

        try {
            carrinhoService.emAprovacao();
        } catch (OperacaoNaoPermitadaRuntimeException e){
//            e.printStackTrace();
            System.out.println("Carrinho no estado Aprovado não pode voltar para Em Aprovacao");
        }

        try {
            carrinhoService.reprovado();
        } catch (OperacaoNaoPermitadaRuntimeException e){
//            e.printStackTrace();
            System.out.println("Carrinho no estado Aprovado não pode voltar ser Reprovado");
        }

        System.out.println("Aplica desconto");
        carrinhoService.aplicaDesconto();
        System.out.println(carrinhoService.getTotalCarrinho());

        System.out.println("Finaliza");
        carrinhoService.finalizado();

        try {
            carrinhoService.aplicaDesconto();
        } catch (OperacaoNaoPermitadaRuntimeException e){
//            e.printStackTrace();
            System.out.println("Carrinho no estado Finalizado não pode aplicar desconto");
        }
    }
}
