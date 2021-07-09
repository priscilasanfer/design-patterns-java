package br.com.alura.loja.imposto;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ICMS implements Imposto {
    public BigDecimal calcular(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.1")).setScale(2, RoundingMode.HALF_UP);
    }
}
