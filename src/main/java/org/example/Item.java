package org.example;

public class Item {
    private int quantity;
    private Produto product;

    public Item(Produto produto, int quantidade) {
        this.product = produto;
        this.quantity = quantidade;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public String getNameProduto() {
        return this.product.getName();
    }

    public Produto getProduto() {
        return this.product;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "produto: " + this.product.getName() + " quantidade: " + this.quantity;
    }
}
