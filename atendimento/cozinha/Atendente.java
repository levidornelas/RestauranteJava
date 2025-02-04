package Restaurante.atendimento.cozinha;

import Restaurante.area.cliente.Cliente;

public class Atendente {
    private String nome;

    public Atendente(String nome) {
        this.nome = nome;
    }

    public void receberPedido(String prato, Cliente cliente) {
        System.out.println("Atendente " + nome + " recebeu o pedido do cliente " + cliente.getNome() + ": " + prato);
    }

    public void pegarPedidoBalcao(Cozinheiro cozinheiro) {
        System.out.println("Atendente " + nome + " está pegando o pedido pronto no balcão.");
        cozinheiro.entregarPedido();
    }

    public void servirMesa(Cliente cliente) {
        System.out.println("Atendente " + nome + " está servindo o prato para " + cliente.getNome() + ".");
    }

    public void receberPagamento(double valor) {
        System.out.println("Atendente " + nome + " recebeu o pagamento de R$ " + valor);
    }

    public void limparMesa() {
        System.out.println("Atendente " + nome + " está limpando a mesa.");
    }
}
