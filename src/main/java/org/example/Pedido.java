package org.example;

import java.util.ArrayList;

public class Pedido {
    private final ArrayList<Item> items;

    public Pedido() {
        this.items = new ArrayList<>();
    }

    public void setItem(Produto produto, int quantity) {
        for (Item item : this.items) {
            if (produto.getName() == item.getProduto().getName()) {
                item.setQuantity(item.getQuantity() + quantity);
                return;
            }
        }

        Item item = new Item(quantity, produto);
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

    public void atualizaStock(boolean compra) {
        for (Item item : this.items) {
            Produto produto = item.getProduto();
            if (compra) {
                produto.setStock(item.getQuantity());
            }
            else {
                produto.removeStock(item.getQuantity());
            }
        }
    }
}
