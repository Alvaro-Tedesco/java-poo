package org.example;

public enum StatusMesa {
    AVAILABLE("DISPONIVEL"),
    OPEN("ABERTA"),
    CLOSED("FECHADA");

    private final String statusAtual;
    StatusMesa(String _status) {
        this.statusAtual = _status;
    }

    public String getStatusAtual() {
        return statusAtual;
    }
}
