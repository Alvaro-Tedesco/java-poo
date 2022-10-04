package org.example;

import java.util.ArrayList;

public class Main {
    public static void main (String[] args) {

        Produto sprite = new Produto("Sprite", 10, 5.50);
        Produto drumstick = new Produto("Drumstick", 25, 4.50);

        Cliente cliente1 = new Cliente("Léo Benaducci");
        Fornecedor fornecedor1 = new Fornecedor("Beto Carreiro");

        PedidoCompra pc = new PedidoCompra(fornecedor1);
        pc.setItem(sprite, 15);
        pc.setItem(drumstick, 20);
        pc.processar();

        // ESPERA-SE QUE TENHA 25 SPRITES E 45 DRUMSTICKS
        System.out.println("Sprite stock: " + sprite.getStock());
        System.out.println("Drumstick stock: " + drumstick.getStock());
//
//        Produto sp = new Produto("sprite", 2);
//        Produto cc = new Produto("cocaCola", 5);
//
//        PedidoCompra p = new PedidoCompra();
//        p.setItem(sp, 2);
//        p.setItem(sp, 2);
//        p.setItem(cc, 5);
//        p.getItems();
//
//        ArrayList<Item> item = p.getIt();
//        item.add(new Item(5, sp));
//
//        p.processar();
//
        PedidoVenda pv = new PedidoVenda(cliente1);
        pv.setItem(sprite, 2);
        pv.setItem(drumstick, 25);
        pv.faturar();

        // ESPERA-SE QUE TENHA 23 SPRITES E 20 DRUMSTICKS
        System.out.println("Sprite stock: " + sprite.getStock());
        System.out.println("Drumstick stock: " + drumstick.getStock());

        System.out.println(cliente1.toString());
        System.out.println(fornecedor1.toString());
//        System.out.println(sp.toString());
//        System.out.println(cc.toString());
    }
}
