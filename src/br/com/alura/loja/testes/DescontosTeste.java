package br.com.alura.loja.testes;

import br.com.alura.loja.descontos.CalculadoraDeDescontos;
import br.com.alura.loja.imposto.CalculadoraDeImposto;
import br.com.alura.loja.imposto.ICMS;
import br.com.alura.loja.imposto.ISS;
import br.com.alura.loja.orcamento.ItemOrcamento;
import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;
import java.util.Arrays;

public class DescontosTeste {
    public static void main(String[] args) {
        Orcamento orcamento1 = new Orcamento();
        orcamento1.adicionaItem(new ItemOrcamento(new BigDecimal("200")));

        Orcamento orcamento2 = new Orcamento();
        orcamento2.adicionaItem(new ItemOrcamento(new BigDecimal("1000")));

        Orcamento orcamento3 = new Orcamento();
        orcamento3.adicionaItem(new ItemOrcamento(new BigDecimal("500")));

        CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();
        System.out.println("Descontos: " + calculadora.calcular(orcamento1));
        System.out.println("Descontos: " + calculadora.calcular(orcamento2));
        System.out.println("Descontos: " + calculadora.calcular(orcamento3));
    }
}
