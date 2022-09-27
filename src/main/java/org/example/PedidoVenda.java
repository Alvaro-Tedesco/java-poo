package org.example;

public class PedidoVenda extends Pedido {
    public PedidoVenda() {
        super();
    }

    public void faturar() {

        this.atualizaStock(false);
    }

}