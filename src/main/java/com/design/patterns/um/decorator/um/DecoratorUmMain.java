package com.design.patterns.um.decorator.um;

import com.design.patterns.um.decorator.um.model.Orcamento;
import com.design.patterns.um.decorator.um.service.*;

public class DecoratorUmMain {

    public static void main(String[] args){
        Orcamento orcamento = new Orcamento(500.00);

        double issValor = 500.00 * 0.15;
        double cofinsValor = 500.00 * 0.10;
        double icmsValor = 500.00 * 0.05;
        double impostoMuitoValor = 500.00 * 0.20;

        ImpostoComplexo iss = new Iss();
        System.out.println(iss.calcula(orcamento) == issValor);

        ImpostoComplexo issAndCofins = new Iss(new Cofins());
        System.out.println(issAndCofins.calcula(orcamento) == (issValor + cofinsValor));

        ImpostoComplexo issAndIcms = new Iss(new Icms());
        System.out.println(issAndIcms.calcula(orcamento) == (issValor + icmsValor));

        ImpostoComplexo issAndCofinsAndIcms = new Iss(new Cofins(new Icms()));
        System.out.println(issAndCofinsAndIcms.calcula(orcamento) == (issValor + cofinsValor + icmsValor));


        ImpostoComplexo issAndCofinsAndIcmsAndImpostoMuitoAlto = new Iss(new Cofins(new Icms(new ImpostoMuitoAlto())));
        System.out.println(issAndCofinsAndIcmsAndImpostoMuitoAlto.calcula(orcamento) == (issValor + cofinsValor
                + icmsValor + impostoMuitoValor));
    }
}
