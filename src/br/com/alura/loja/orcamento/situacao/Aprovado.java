package br.com.alura.loja.orcamento.situacao;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Aprovado extends SituacaoOrcamento {

    public BigDecimal calcularValorDescontoExtra(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.02")).setScale(2, RoundingMode.HALF_UP);
    }

    @Override
    public void finalizar(Orcamento orcamento) {
        orcamento.setSituacao(new Finalizado());
    }
}
