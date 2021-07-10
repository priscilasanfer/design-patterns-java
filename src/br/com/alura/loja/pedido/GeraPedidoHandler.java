package br.com.alura.loja.pedido;

import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.pedido.acoes.EnviarEmailPedido;
import br.com.alura.loja.pedido.acoes.SalvarPedidoNoBanco;

import java.time.LocalDateTime;

public class GeraPedidoHandler {
    // Construtor com injeção de dependencia: repository, service, ...

    public void executar(GeraPedido dados) {
        Orcamento orcamento = new Orcamento(dados.getValorDoPedido(), dados.getQuantidade());
        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);

        EnviarEmailPedido email = new EnviarEmailPedido();
        SalvarPedidoNoBanco salvar = new SalvarPedidoNoBanco();

        email.executar(pedido);
        salvar.executar(pedido);
    }

}
