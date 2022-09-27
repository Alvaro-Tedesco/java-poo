package org.example;

import java.util.ArrayList;

public class Main {
    public static void main (String[] args) {

        Produto sp = new Produto("sprite", 2);
        Produto cc = new Produto("cocaCola", 5);

        PedidoCompra p = new PedidoCompra();
        p.setItem(sp, 2);
        p.setItem(sp, 2);
        p.setItem(cc, 5);
        p.getItems();

        ArrayList<Item> item = p.getIt();
        item.add(new Item(5, sp));

        p.processar();

        System.out.println(sp.toString());
        System.out.println(cc.toString());


    }
}
