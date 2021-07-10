package br.com.alura.loja.descontos;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class DescontoParaOrcamentoComValorMaiorQueQuinhentos extends Desconto {

    public DescontoParaOrcamentoComValorMaiorQueQuinhentos(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal efetuarCalculo(Orcamento orcamento) {

        return orcamento.getValor().multiply(new BigDecimal("0.05"))
                .setScale(2, RoundingMode.HALF_UP);
    }

    @Override
    public boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getValor().compareTo(new BigDecimal("500")) > 0;
    }
}