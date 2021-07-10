package br.com.alura.loja.testes;

import br.com.alura.loja.pedido.GeraPedido;
import br.com.alura.loja.pedido.GeraPedidoHandler;
import br.com.alura.loja.pedido.acoes.EnviarEmailPedido;
import br.com.alura.loja.pedido.acoes.SalvarPedidoNoBanco;

import java.math.BigDecimal;
import java.util.Arrays;

public class PedidosTeste {
    public static void main(String[] args) {
//        Representação de uma inteface para o usuario, uma interface por linha de
//        String cliente = args[0];
//        BigDecimal valorOrcamento = new BigDecimal(args[1]);
//        int quantidadeItens = Integer.parseInt(args[2]);

        String cliente = "Pri";
        BigDecimal valorOrcamento = new BigDecimal("1000");
        int quantidadeItens = Integer.parseInt("2");

        GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
        GeraPedidoHandler handler = new GeraPedidoHandler(
                Arrays.asList(
                        new SalvarPedidoNoBanco(),
                        new EnviarEmailPedido())
        );
        handler.executar(gerador);
    }
}
