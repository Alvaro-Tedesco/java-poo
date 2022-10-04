package org.example;

public class Fornecedor extends Pessoa {

    public Fornecedor(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Fornecedor:\n" + super.toString();
    }
}
