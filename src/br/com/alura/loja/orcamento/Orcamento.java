package br.com.alura.loja.orcamento;

import java.math.BigDecimal;

public class Orcamento {

    private BigDecimal valor;
    private int quantidadeDeItens;
    private String situacao;

    public Orcamento(BigDecimal valor, int quantidadeDeItens) {
        this.valor = valor;
        this.quantidadeDeItens = quantidadeDeItens;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public int getQuantidadeDeItens() {
        return quantidadeDeItens;
    }

    public void aplicarDescontoExtra() {
        BigDecimal valorDoDescontoExtra = BigDecimal.ZERO;

        if (situacao.equals("EM ANALISE")) {
            valorDoDescontoExtra = new BigDecimal("0.05");
        } else if (situacao.equals("APROVADO")) {
            valorDoDescontoExtra = new BigDecimal("0.02");

        }
        this.valor.subtract(valorDoDescontoExtra);
    }

}
