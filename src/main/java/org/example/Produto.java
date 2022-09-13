package org.example;

public class Produto {
    //    private int id;
    private String name;
    private Double unitPrice;
    private int stock;

    public Produto(String name, int stock /*, Double unitPrice */) {
        this.name = name;
        this.stock = stock;
//        this.unitPrice = unitPrice;
    }

    public int getStock() {
        return stock;
    }

    public void removeStock(int quantity) {
        if (this.stock > quantity) this.stock -= quantity;
    }

    public void addStock(int quantity) {
        this.stock += quantity;
    }
}