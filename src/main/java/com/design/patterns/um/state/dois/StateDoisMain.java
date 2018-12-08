package com.design.patterns.um.state.dois;

import com.design.patterns.um.state.dois.exception.EstourouLimiteDeCreditoDisponivelRuntimeException;
import com.design.patterns.um.state.dois.model.ContaBancaria;
import com.design.patterns.um.state.dois.service.OperacaoBancariaService;

public class StateDoisMain {

    public static void main(String[] args){
        ContaBancaria contaBancaria = new ContaBancaria(-50.00, 100.00);

        OperacaoBancariaService operacaoBancariaService = new OperacaoBancariaService(contaBancaria);

        System.out.println("Sacando 20.00 da conta bancaria");
        operacaoBancariaService.sacar(20.00);
        System.out.println("Saldo atual");
        System.out.println(operacaoBancariaService.getSaldoAtualContaBancaria());

        System.out.println("Sacando 30.00 da conta bancaria");
        operacaoBancariaService.sacar(30.00);
        System.out.println("Saldo atual");
        System.out.println(operacaoBancariaService.getSaldoAtualContaBancaria());

        try {
            operacaoBancariaService.sacar(10.00);
            System.out.println(operacaoBancariaService.getSaldoAtualContaBancaria());
        } catch (EstourouLimiteDeCreditoDisponivelRuntimeException e) {
            System.out.println("Saque nao permitido");
        }

        System.out.println("Deposito feito no valor de 150.00");
        operacaoBancariaService.depositar(150.00);
        System.out.println("Saldo atual conta bancaria");
        System.out.println(operacaoBancariaService.getSaldoAtualContaBancaria());

        System.out.println("Estado atual:");
        System.out.println(operacaoBancariaService.getEstadoContaBancaria());

        System.out.println("Sacando 42.50 da conta bancaria");
        operacaoBancariaService.sacar(42.50);
        System.out.println("Saldo atual");
        System.out.println(operacaoBancariaService.getSaldoAtualContaBancaria());

        System.out.println("Deposito feito no valor de 50.00");
        operacaoBancariaService.depositar(50.00);
        System.out.println("Saldo atual conta bancaria");
        System.out.println(operacaoBancariaService.getSaldoAtualContaBancaria());

        System.out.println("Sacando 150.00 da conta bancaria");
        operacaoBancariaService.sacar(149.00);
        System.out.println("Saldo atual");
        System.out.println(operacaoBancariaService.getSaldoAtualContaBancaria());

        System.out.println("Estado atual:");
        System.out.println(operacaoBancariaService.getEstadoContaBancaria());
    }
}
