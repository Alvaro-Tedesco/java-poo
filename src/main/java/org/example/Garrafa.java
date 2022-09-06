package org.example;

public class Garrafa {
    private double volumeMaximo;
    private double conteudo;

    public Garrafa() {
        this.conteudo = 0.0;
    }

    public void setVolumeMaximo(double volumeMaximo) {
        if (volumeMaximo < 0) System.out.println("Valor inválido!");
        else this.volumeMaximo = volumeMaximo;
    }

    public void encher(double quantitade) {
        double volumeRestante = volumeMaximo - conteudo;
        if (quantitade > volumeRestante) {
            System.out.println("Impossível encher a garrafa com " + quantitade + " litros." +
                    " Garrafa contém " + volumeRestante + " litros restantes do total de " +
                    volumeMaximo + " litros.");
        }
        else {
            conteudo = conteudo + quantitade;
            System.out.println("Encheu " + quantitade + " litros. Garrafa contém " + conteudo +
                    " litros do total de " + volumeMaximo + " litros.");
        }
    }

    public void esvaziar(double quantitade) {
        if (quantitade > conteudo) {
            System.out.println("Impossível esvaziar a garrafa. Garrafa contém " + conteudo +
                    " litros do total de " + volumeMaximo + " litros.");
        }
        else {
            conteudo = conteudo - quantitade;
            System.out.println("Esvaziou " + quantitade + " litros. Garrafa contém " + conteudo +
                    " litros do total de " + volumeMaximo + " litros.");
        }
    }

    public void encherTudo() {
        conteudo = volumeMaximo;
        System.out.println("Encheu tudo. Garrafa contém " + conteudo +
                " litros do total de " + volumeMaximo + " litros.");
    }

    public void esvaziarTudo() {
        conteudo = 0;
        System.out.println("Esvaziou tudo. Garrafa contém " + conteudo +
                " litros do total de " + volumeMaximo + " litros.");
    }
}
