package org.example;

public class Item {
    private int quantity;
    private Produto produto;

    public Item(int quantity, Produto produto) {
        this.quantity = quantity;
        this.produto = produto;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Produto getProduto() {
        return produto;
    }

    @Override
    public String toString() {
        return "produto: " + this.produto.getName() + " quantidade: " + this.quantity;
    }
}
