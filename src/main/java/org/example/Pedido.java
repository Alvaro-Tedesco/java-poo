package org.example;

import java.util.ArrayList;

public class Pedido {
    private final ArrayList<Item> items;
    private final Pessoa pessoa;

    public Pedido(Pessoa pessoa) {
        this.pessoa = pessoa;
        this.items = new ArrayList<>();
    }

    public void setItem(Produto produto, int quantity) {
        for (Item item : this.items) {
            if (produto.getName() == item.getProduct().getName()) {
                item.setQuantity(item.getQuantity() + quantity);
                return;
            }
        }

        Item item = new Item(produto, quantity);
        this.items.add(item);
    }

    public void getItems() {
        for (Item item : this.items) {
            System.out.println(item.toString());
        }
    }

    public ArrayList<Item> getIt() {
        return this.items;
    }

    public void updateStock(boolean compra) {
        for (Item item : this.items) {
            Produto produto = item.getProduct();
            if (compra) {
                produto.setStock(item.getQuantity());
                continue;
            }

            produto.removeStock(item.getQuantity());
        }
    }

    public void updateBalance() {
        for (Item item : this.items) {
            double price = item.getProduct().getUnitPrice();
            int qtd = item.getQuantity();

            this.pessoa.setBalance(price * qtd);
        }
    }
}
