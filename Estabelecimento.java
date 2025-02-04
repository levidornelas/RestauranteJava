package Restaurante;

import Restaurante.area.cliente.Cliente;
import Restaurante.atendimento.cozinha.Atendente;
import Restaurante.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
    public static void main(String[] args) {
        // Instanciando os objetos
        Cliente cliente = new Cliente("Levi");
        Atendente atendente = new Atendente("Maria");
        Cozinheiro cozinheiro = new Cozinheiro("Carlos");

        String prato = "Frango à Parmegiana";
        double valorPedido = 45.90;

        // Fluxo do atendimento
        cliente.escolherPrato();
        cliente.pedirPrato(atendente, prato);
        atendente.pegarPedidoBalcao(cozinheiro);
        cozinheiro.prepararPedido(prato);
        cozinheiro.entregarPedido();
        atendente.servirMesa(cliente);
        cliente.comer();
        cliente.pagarPedido(atendente, valorPedido);
        atendente.limparMesa();
    }
}
