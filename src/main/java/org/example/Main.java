package org.example;

import java.util.ArrayList;

public class Main {
    public static void main (String[] args) {

        Produto sprite = new Produto("Sprite", 10, 10.50);
        Produto drumstick = new Produto("Drumstick", 25, 4.25);

        Cliente jose = new Cliente("José");
        Fornecedor maria = new Fornecedor("Maria Shark");

        PedidoCompra pc = new PedidoCompra(maria);
        pc.setItem(sprite, 15);
        pc.setItem(drumstick, 20);
        pc.processar();

        // ESPERA-SE QUE TENHA 25 SPRITES E 45 DRUMSTICKS
        System.out.println("Sprite " + sprite.getStock());
        System.out.println("Drumstick " + drumstick.getStock());


        PedidoVenda pv = new PedidoVenda(jose);
        pv.setItem(sprite, 2);
        pv.setItem(drumstick, 5);
        pv.faturar();

        // ESPERA-SE QUE TENHA 23 SPRITES E 40 DRUMSTICKS
        System.out.println("Sprite " + sprite.getStock());
        System.out.println("Drumstick " + drumstick.getStock());

        System.out.println(jose.toString());
        System.out.println(maria.toString());
    }
}
