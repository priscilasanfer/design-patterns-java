package br.com.alura.loja.pedido.acoes;

import br.com.alura.loja.pedido.Pedido;

public class EnviarEmailPedido  implements AcaoAposGerarPedido{
    public void executarAcao(Pedido pedido){
        System.out.println("Enviar email pedido");
    }
}
