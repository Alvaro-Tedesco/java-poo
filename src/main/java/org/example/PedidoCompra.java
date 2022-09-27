package org.example;

public class PedidoCompra extends Pedido {
    public PedidoCompra() {
        super();
    }

    public void processar() {
        this.atualizaStock(true);
    }
}
