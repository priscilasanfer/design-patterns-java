package br.com.alura.loja.descontos;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class Desconto {
    protected Desconto proximo;

    public Desconto(Desconto proximo) {
        this.proximo = proximo;
    }

    protected abstract BigDecimal efetuarCalculo(Orcamento orcamento);

    protected abstract boolean deveAplicar(Orcamento orcamento);

    public BigDecimal calcular(Orcamento orcamento) {
        if (deveAplicar(orcamento)) {
            return efetuarCalculo(orcamento);
        }
        return proximo.calcular(orcamento);
    }
}
