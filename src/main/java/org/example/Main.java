package org.example;

import java.util.ArrayList;

public class Main {
    public static void main (String[] args) {

        Produto sprite = new Produto("Sprite", 10);
        Produto drumstick = new Produto("Drumstick", 25);

        PedidoCompra pc = new PedidoCompra();
        pc.setItem(sprite, 15);
        pc.setItem(drumstick, 20);
        pc.processar();

        // ESPERA-SE QUE TENHA 25 SPRITES E 45 DRUMSTICKS
        System.out.println("Sprite " + sprite.getStock());
        System.out.println("Drumstick " + drumstick.getStock());

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

        PedidoVenda pv = new PedidoVenda();
        pv.setItem(sprite, 2);
        pv.setItem(drumstick, 5);
        pv.faturar();

        // ESPERA-SE QUE TENHA 23 SPRITES E 40 DRUMSTICKS
        System.out.println("Sprite " + sprite.getStock());
        System.out.println("Drumstick " + drumstick.getStock());
        System.out.println(sp.toString());
        System.out.println(cc.toString());


    }
}
