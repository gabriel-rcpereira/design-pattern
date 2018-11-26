package com.design.patterns.um.templatemethod.dois;

import com.design.patterns.um.templatemethod.dois.model.Banco;
import com.design.patterns.um.templatemethod.dois.model.Conta;
import com.design.patterns.um.templatemethod.dois.model.Pessoa;
import com.design.patterns.um.templatemethod.dois.service.Relatorio;
import com.design.patterns.um.templatemethod.dois.service.RelatorioComplexo;
import com.design.patterns.um.templatemethod.dois.service.RelatorioSimples;

import java.util.Arrays;
import java.util.List;

public class TemplateMethodDoisMain {
    public static void main(String[] args){
        TemplateMethodDoisMain templateMethodDoisMain = new TemplateMethodDoisMain();
        List<Conta> contas = templateMethodDoisMain.createContas();

        Relatorio relatorioSimples = new RelatorioSimples(contas);
        relatorioSimples.imprimirRelatorio();

        Relatorio relatorioComplexo = new RelatorioComplexo(contas);
        relatorioComplexo.imprimirRelatorio();
    }

    private List<Conta> createContas(){
        Banco bancoUm = createBancoUm();
        createConta(bancoUm, createPessoa(1L, "Pessoa Um"));
        createConta(bancoUm, createPessoa(2L, "Pessoa Dois"));

        return Arrays.asList(createConta(bancoUm, createPessoa(1L, "Pessoa Um")),
                createConta(bancoUm, createPessoa(2L, "Pessoa Dois")));
    }

    private Banco createBancoUm() {
        Banco bancoUm = new Banco();
        bancoUm.setId(1L);
        bancoUm.setAgencia(1);
        bancoUm.setEmail("banco.ag.um@branco.com.br");
        bancoUm.setEndereco("Endereço banco um");
        bancoUm.setName("Nome banco um");
        bancoUm.setTelefone("35-1111-1111");
        return bancoUm;
    }

    private Conta createConta(Banco bancoUm, Pessoa pessoaUm) {
        Conta contaUm = new Conta();
        contaUm.setId(1L);
        contaUm.setBanco(bancoUm);
        contaUm.setPessoa(pessoaUm);
        contaUm.setSaldo(1001.0);
        return contaUm;
    }

    private Pessoa createPessoa(long id, String name) {
        Pessoa pessoaUm = new Pessoa();
        pessoaUm.setId(id);
        pessoaUm.setName(name);
        return pessoaUm;
    }
}
