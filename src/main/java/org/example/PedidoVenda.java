package org.example;

public class PedidoVenda extends Pedido {
    public PedidoVenda(Cliente cliente) {
        super(cliente);
    }

    public void faturar() {
        this.updateStock(false);
        this.updateBalance();
    }
}
