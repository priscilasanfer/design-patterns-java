package br.com.alura.loja.testes;

import br.com.alura.loja.descontos.CalculadoraDeDescontos;
import br.com.alura.loja.imposto.CalculadoraDeImposto;
import br.com.alura.loja.imposto.ICMS;
import br.com.alura.loja.imposto.ISS;
import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontosTeste {
    public static void main(String[] args) {
        Orcamento orcamento1 = new Orcamento(new BigDecimal("100.00"), 10);
        Orcamento orcamento2 = new Orcamento(new BigDecimal("1000.00"), 1);

        CalculadoraDeDescontos calculadoraDeDescontos = new CalculadoraDeDescontos();
        System.out.println("Descontos: " + calculadoraDeDescontos.calcular(orcamento1));
        System.out.println("Descontos: " + calculadoraDeDescontos.calcular(orcamento2));
    }
}
