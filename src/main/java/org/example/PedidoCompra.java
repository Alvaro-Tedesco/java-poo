package org.example;

public class PedidoCompra extends Pedido {
    public PedidoCompra(Fornecedor fornecedor) {
        super(fornecedor);
    }

    public void processar() {
        this.updateStock(true);
        this.updateBalance();
    }
}
