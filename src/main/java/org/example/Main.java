package org.example;

public class Main {
    public static void main (String[] args) {
        Mesa mesa1 = new Mesa(10);
        Mesa mesa2 = new Mesa(12);

        Garcom garcom1 = new Garcom("Tony Sterko");
        Garcom garcom2 = new Garcom("Américo");

        Musico musico1 = new Musico("Trevis Scott");

        Produto cocaina = new Produto("Cocaína", 150.00);
        Produto refri = new Produto("Refri", 7.00);
        Produto hamburgao = new Produto("Hamburger com muito catupiri", 5.00);

        mesa1.abrir(5, garcom1, musico1);
        mesa1.pedir(cocaina, 2);
        mesa1.pedir(refri, 5);
        mesa1.fechar(5);

        mesa2.abrir(1, garcom2, musico1);
        mesa2.pedir(refri, 10);
        mesa2.pedir(hamburgao, 5);
        mesa2.fechar(9);

        System.out.println(garcom1.toString());
        System.out.println(garcom2.toString());

        System.out.println(musico1.toString());

    }
}
