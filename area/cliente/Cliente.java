package Restaurante.area.cliente;

import Restaurante.atendimento.cozinha.Atendente;

public class Cliente {
    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public void escolherPrato() {
        System.out.println(nome + " está escolhendo pratos...");
    }

    public void pedirPrato(Atendente atendente, String prato) {
        System.out.println(nome + " pediu o prato: " + prato);
        atendente.receberPedido(prato, this);
    }

    public void pagarPedido(Atendente atendente, double valor) {
        System.out.println(nome + " está pagando o pedido de R$ " + valor);
        atendente.receberPagamento(valor);
    }

    public void comer() {
        System.out.println(nome + " está comendo o prato.");
    }

    public String getNome() {
        return nome;
    }
}
