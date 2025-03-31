package sistema_animais;

import java.util.ArrayList;

// Classe responsável por armazenar e gerenciar os animais
public class SistemaCadastro {
    private ArrayList<Animal> listaAnimais = new ArrayList<>();

    public void adicionarAnimal(Animal animal) {
        listaAnimais.add(animal);
    }

    public void listarAnimais() {
        if (listaAnimais.isEmpty()) {
            System.out.println("Nenhum animal cadastrado.");
            return;
        }
        for (Animal animal : listaAnimais) {
            System.out.println(animal.getDescricao());
        }
    }

    public void emitirSons() {
        for (Animal animal : listaAnimais) {
            animal.emitirSom();
        }
    }
}
