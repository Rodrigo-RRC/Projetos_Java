package uninter;

import java.util.ArrayList;

// Classe Cofrinho é responsável por armazenar e gerenciar as moedas
public class Cofrinho {

    // Lista que armazena objetos do tipo Moeda
    private ArrayList<Moeda> moedas = new ArrayList<>();

    // Adiciona uma moeda ao cofrinho
    public void adicionarMoeda(Moeda moeda) {
        moedas.add(moeda);
        System.out.println("Moeda adicionada.");
    }

    // Remove uma moeda específica do cofrinho
    public void removerMoeda(Moeda moeda) {
        if (moedas.remove(moeda)) {
            System.out.println("Moeda removida.");
        } else {
            System.out.println("Moeda não encontrada.");
        }
    }

    // Lista todas as moedas presentes no cofrinho
    public void listarMoedas() {
        if (moedas.isEmpty()) {
            System.out.println("Cofrinho está vazio.");
            return;
        }
        System.out.println("Moedas no cofrinho:");
        for (Moeda m : moedas) {
            System.out.println(m);
        }
    }

    // Calcula o total de moedas convertidas para real
    public double totalConvertido() {
        double total = 0;
        for (Moeda m : moedas) {
            total += m.converter();
        }
        return total;
    }
}
