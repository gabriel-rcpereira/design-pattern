package com.design.patterns.um.state.dois;

import com.design.patterns.um.state.dois.exception.SaqueNaoPermitidoRuntimeException;
import com.design.patterns.um.state.dois.model.ContaBancaria;
import com.design.patterns.um.state.dois.service.OperacaoBancariaService;

public class StateDoisMain {

    public static void main(String[] args){
        ContaBancaria contaBancaria = new ContaBancaria(-50.00, 100.00);

        OperacaoBancariaService operacaoBancariaService = new OperacaoBancariaService(contaBancaria);

        operacaoBancariaService.sacar(20.00);
        System.out.println(operacaoBancariaService.getSaldoAtualContaBancaria());

        operacaoBancariaService.sacar(30.00);
        System.out.println(operacaoBancariaService.getSaldoAtualContaBancaria());

        try {
            operacaoBancariaService.sacar(10.00);
            System.out.println(operacaoBancariaService.getSaldoAtualContaBancaria());
        } catch (SaqueNaoPermitidoRuntimeException e) {
            System.out.println("Saque nao permitido");
        }
    }
}
