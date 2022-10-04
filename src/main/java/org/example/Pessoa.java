package org.example;

import java.util.Random;

public class Pessoa {
    private final int id;
    private final String name;
//    private Endereco endereco;
    private double balance;

    public Pessoa(String name) {
        this.id = new Random().nextInt();
        this.name = name;
        this.balance = 0.00;
    }

    public String getName() {
        return this.name;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double value) {
        this.balance += value;
    }

    @Override
    public String toString() {
        return this.name + ": R$ " + this.balance;
    }
}
