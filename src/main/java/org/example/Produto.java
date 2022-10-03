package org.example;

import java.util.Random;

public class Produto {
    private int id;
    private String name;
    private Double unitPrice;
    private int stock;

    public Produto(String name, int stock /*, Double unitPrice */) {
        this.id = new Random().nextInt();
        this.name = name;
        this.stock = stock;
//        this.unitPrice = unitPrice;
    }

    public String getName() {
        return this.name;
    }

    public int getStock() {
        return this.stock;
    }

    public void removeStock(int quantity) {
        if (this.stock >= quantity) this.stock -= quantity;
    }

    public void setStock(int quantity) {
        this.stock += quantity;
    }

    @Override
    public String toString() {
        return this.name + " = " + this.stock;
    }
}