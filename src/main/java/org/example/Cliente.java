package org.example;

public class Cliente extends Pessoa {

    public Cliente(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return  "-------------------------------------------\n" +
                "Cliente\n" + super.toString() +
                "\n-------------------------------------------\n";
    }
}
