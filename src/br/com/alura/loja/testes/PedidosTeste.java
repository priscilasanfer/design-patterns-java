package br.com.alura.loja.testes;

import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.pedido.GeraPedido;
import br.com.alura.loja.pedido.Pedido;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class PedidosTeste {
    public static void main(String[] args) {
//        Representação de uma inteface para o usuario, uma interface por linha de comando
        String cliente = args[0];
        BigDecimal valorOrcamento = new BigDecimal(args[1]);
        int quantidadeItens = Integer.parseInt(args[2]);

        GeraPedido gerarPedido = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
        gerarPedido.executa();

    }
}
