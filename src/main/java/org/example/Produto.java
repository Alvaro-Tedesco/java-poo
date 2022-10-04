package org.example;

import java.util.Random;

public class Produto {
    private final int id;
    private final String name;
    private final Double unitPrice;
    private int stock;

    public Produto(String name, int stock , Double unitPrice) {
        this.id = new Random().nextInt();
        this.name = name;
        this.stock = stock;
        this.unitPrice = unitPrice;
    }

    public String getName() {
        return this.name;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setStock(int quantity) {
        this.stock += quantity;
    }

    public int getStock() {
        return this.stock;
    }

    public void removeStock(int quantity) {
        if (this.stock >= quantity) this.stock -= quantity;
    }

    @Override
    public String toString() {
        return this.name + " = " + this.stock;
    }
}