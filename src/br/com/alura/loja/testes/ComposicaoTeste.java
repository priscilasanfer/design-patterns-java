package br.com.alura.loja.testes;

import br.com.alura.loja.descontos.CalculadoraDeDescontos;
import br.com.alura.loja.orcamento.ItemOrcamento;
import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class ComposicaoTeste {
    public static void main(String[] args) {
        Orcamento antigo = new Orcamento();
        antigo.adicionaItem(new ItemOrcamento(new BigDecimal("200")));
        antigo.reprovar();

        Orcamento novo = new Orcamento();
        novo.adicionaItem(new ItemOrcamento(new BigDecimal("500")));
        novo.adicionaItem(antigo);

        System.out.println(novo.getValor());
    }
}
