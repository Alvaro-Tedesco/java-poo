package org.example;

import java.util.Random;

public class Pessoa {
    private final int id;
    private final String name;
    private double balance;
//    private Endereco endereco;

    public Pessoa(String name) {
        this.id = new Random().nextInt();
        this.name = name;
        this.balance = 0.0;
    }

    public String getName() {
        return name;
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
