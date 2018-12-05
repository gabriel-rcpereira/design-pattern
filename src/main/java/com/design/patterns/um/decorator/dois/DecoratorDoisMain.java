package com.design.patterns.um.decorator.dois;

import com.design.patterns.um.decorator.dois.model.Conta;
import com.design.patterns.um.decorator.dois.service.Filtro;
import com.design.patterns.um.decorator.dois.service.MesAberturaCorrenteService;
import com.design.patterns.um.decorator.dois.service.SaldoMaiorCemMilService;
import com.design.patterns.um.decorator.dois.service.SaldoMenorCemService;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class DecoratorDoisMain {

    public static void main(String[] args){
        aplicarFiltroMesAbertura();
        aplicarFiltroSaldoMaiorCemMil();
        aplicarFiltroSaldoMenorCem();
    }

    private static void aplicarFiltroMesAbertura() {
        List<Conta> contas = Arrays.asList(new Conta(1, 99.00, LocalDate.now()));

        Filtro filtro = new MesAberturaCorrenteService();
        List<Conta> contasFiltradas = filtro.aplicar(contas);

        contasFiltradas.forEach(conta -> System.out.println(conta.getId()));
    }

    private static void aplicarFiltroSaldoMaiorCemMil() {
        List<Conta> contas = Arrays.asList(new Conta(1, 99.00, LocalDate.now()));

        Filtro filtro = new SaldoMaiorCemMilService();
        List<Conta> contasFiltradas = filtro.aplicar(contas);

        contasFiltradas.forEach(conta -> System.out.println(conta.getId()));
    }

    private static void aplicarFiltroSaldoMenorCem() {
        List<Conta> contas = Arrays.asList(new Conta(1, 99.00, LocalDate.now()));

        Filtro filtro = new SaldoMenorCemService();
        List<Conta> contasFiltradas = filtro.aplicar(contas);

        contasFiltradas.forEach(conta -> System.out.println(conta.getId()));
    }
}
