package org.example;

import java.util.ArrayList;

public class Mesa {

    private int identificacao; // numero da mesa
    private int numeroPessoas; // pessoas na mesa para o couvert
    private String status; // "ABERTA" ou "FECHADA"
    private final ArrayList<Lancamento> items; // lancamento da mesa

    private Garcom garcom; // garcom vinculado à mesa

    private Musico musico; // musico vinculado à mesa

    public Mesa(int _numeroDaMesa) {
        this.identificacao = _numeroDaMesa;
        this.items = new ArrayList<>();
        this.status = StatusMesa.AVAILABLE.getStatusAtual();
    }

    public void abrir(int _numeroDePessoas, Garcom _garcom, Musico _musico) {
        if (this.status == StatusMesa.OPEN.getStatusAtual()) {
            System.out.println("MESA " + identificacao + " já está ABERTA!");
            return;
        }
        this.garcom = _garcom;
        this.musico = _musico;
        this.numeroPessoas = _numeroDePessoas;
        this.status = StatusMesa.OPEN.getStatusAtual();
    }

    public void pedir(Produto _produto, int _quantidade) {
        if (this.status == StatusMesa.AVAILABLE.getStatusAtual()) {
            System.out.println("Mesa " + identificacao + " ainda não foi aberta!");
            return;
        }

        Lancamento lancamento = new Lancamento();
        lancamento.produto = _produto;
        lancamento.quantidade = _quantidade;
//        lancamento.precoUnitario = _precoUnitario;

        items.add(lancamento);
    }

    public void fechar(double _valorCouvert) {
        if (this.status == StatusMesa.AVAILABLE.getStatusAtual()) {
            System.out.println("Mesa " + identificacao + " ainda não foi aberta!");
            return;
        }

        double couvert = _valorCouvert * numeroPessoas;
        // total items
        double totalItems = 0;
        for (Lancamento lan : items) {
            totalItems = totalItems + (lan.quantidade * lan.produto.getPrecoUnitario());
        }

        double porcentagemDoGarcom = totalItems * 0.10;

        double totalConta = totalItems + couvert + porcentagemDoGarcom;

        this.garcom.LancarComissao(porcentagemDoGarcom);
        this.musico.LancarComissao(couvert);

        this.status = StatusMesa.AVAILABLE.getStatusAtual();

        this.notaDeFechamentoDaMesa(couvert, totalConta, porcentagemDoGarcom);
    }

    public void notaDeFechamentoDaMesa(Double _couvert, Double _totalConta, Double _porcentagemDoGarcom) {
        System.out.println(
                ("\n***************     FECHAMENTO MESA " + this.identificacao + "     ***************") +
                        "\nCouvert R$ " + _couvert +
                        "\nAtendido por: " + garcom.getNome() +
                        "\nMúsico: " + musico.getNome() +
                        "\n\nConta da mesa " + this.identificacao + " foi de R$ " + _totalConta.toString().replace('.', ',')
        );
    }
}
