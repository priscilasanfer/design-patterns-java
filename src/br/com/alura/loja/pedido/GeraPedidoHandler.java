package br.com.alura.loja.pedido;

import br.com.alura.loja.orcamento.Orcamento;

import java.time.LocalDateTime;

public class GeraPedidoHandler {
    // Construtor com injeção de dependencia: repository, service, ...

    public void executar(GeraPedido dados){
        Orcamento orcamento = new Orcamento(dados.getValorDoPedido(), dados.getQuantidade());
        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);

        System.out.println("Salvar pedido no banco de dados");
        System.out.println("Enviar email com dados do novo pedido ");

    }

}
