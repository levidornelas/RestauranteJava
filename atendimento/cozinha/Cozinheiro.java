package Restaurante.atendimento.cozinha;

public class Cozinheiro {
    private String nome;

    public Cozinheiro(String nome) {
        this.nome = nome;
    }

    public void prepararPedido(String prato) {
        System.out.println("Cozinheiro " + nome + " está preparando o prato: " + prato);
    }

    public void entregarPedido() {
        System.out.println("Cozinheiro " + nome + " finalizou o pedido e deixou no balcão.");
    }
}
