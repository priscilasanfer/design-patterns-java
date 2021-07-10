package br.com.alura.loja.testes;

import br.com.alura.loja.imposto.CalculadoraDeImposto;
import br.com.alura.loja.imposto.ICMS;
import br.com.alura.loja.imposto.ISS;
import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class ImpostosTeste {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("100.00"), 10);
        CalculadoraDeImposto calculadoraDeImposto = new CalculadoraDeImposto();

        System.out.println("ICMS: " + calculadoraDeImposto.calcular(orcamento, new ICMS(null)));
        System.out.println("ISS: " + calculadoraDeImposto.calcular(orcamento, new ISS (null)));
        System.out.println("ICMS + ISS: " + calculadoraDeImposto.calcular(orcamento, new ICMS (new ISS(null))));

    }
}
