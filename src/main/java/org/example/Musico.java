package org.example;

public class Musico {

    public int identificacao;
    private String nome;
    private double comissao;

    public Musico (String _nome) {
        this.nome = _nome;
        this.comissao = 0;
    }

    public void LancarComissao (double _saldo) {
        this.comissao += _saldo;
    }

    public String getNome() {
        return nome;
    }

    public double getComissao() {
        return comissao;
    }

    @Override
    public String toString() {
        return "\nComissão total do Músico " + this.getNome() + "de R$ " + this.getComissao();
    }
}
