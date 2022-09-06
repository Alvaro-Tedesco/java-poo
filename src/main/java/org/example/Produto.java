package org.example;

public class Produto {

    private String nome;
    private Double precoUnitario;

    public Produto(String _nome, Double _precoUnitario) {
        this.nome = _nome;
        this.precoUnitario = _precoUnitario;
    }

    public String getNome() {
        return nome;
    }

    public Double getPrecoUnitario() {
        return precoUnitario;
    }
}
