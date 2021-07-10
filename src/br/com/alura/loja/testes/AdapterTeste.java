package br.com.alura.loja.testes;

import br.com.alura.loja.http.JavaHttpClient;
import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.orcamento.RegistraOrcamento;

import java.math.BigDecimal;

public class AdapterTeste {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"), 1);
        orcamento.aprovar();
        orcamento.finalizar();

        RegistraOrcamento regitro = new RegistraOrcamento(new JavaHttpClient());
        regitro.registrar(orcamento);
    }
}
