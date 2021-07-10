package br.com.alura.loja.pedido;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class GeraPedido {
    private String cliente;
    private BigDecimal valorDoPedido;
    private int quantidade;

    public GeraPedido(String cliente, BigDecimal valorDoPedido, int quantidade) {
        this.cliente = cliente;
        this.valorDoPedido = valorDoPedido;
        this.quantidade = quantidade;
    }

    public void executa() {
        Orcamento orcamento = new Orcamento(this.valorDoPedido, this.quantidade);
        Pedido pedido = new Pedido(this.cliente, LocalDateTime.now(), orcamento);

        System.out.println("Salvar pedido no banco de dados");
        System.out.println("Enviar email com dados do novo pedido ");
    }
}
