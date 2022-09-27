package org.example;

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

        PedidoVenda pv = new PedidoVenda();
        pv.setItem(sprite, 2);
        pv.setItem(drumstick, 5);
        pv.faturar();

        // ESPERA-SE QUE TENHA 23 SPRITES E 40 DRUMSTICKS
        System.out.println("Sprite " + sprite.getStock());
        System.out.println("Drumstick " + drumstick.getStock());
    }
}
