package org.example;

import java.util.ArrayList;

public class Pedido {
    private final ArrayList<Item> items;

    public Pedido() {
        this.items = new ArrayList<>();
    }

    public void setItem(Produto produto, int quantidade) {
        Item item = new Item(produto, quantidade);
        this.items.add(item);
    }

    public void getItems() {
        for (Item item : this.items) {
            System.out.println(item.getNameProduto() + " " + item.getQuantidade());
        }
//        return this.items;
    }

    public void atualizaEstoque(boolean compra) {
        for (Item item : this.items) {
            Produto produto = item.getProduto();
            if (compra) {
                produto.addStock(item.getQuantidade());
            } else {
                produto.removeStock(item.getQuantidade());
            }
        }
    }
}
