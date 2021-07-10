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

    public String getCliente() {
        return cliente;
    }

    public BigDecimal getValorDoPedido() {
        return valorDoPedido;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
