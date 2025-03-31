package sistema_animais;

// Classe que herda de Animal
public class Gato extends Animal {
    private String cor;

    public Gato(String nome, int idade, String cor) {
        super(nome, idade);
        this.cor = cor;
    }

    // Implementação do método emitirSom para gato
    @Override
    public void emitirSom() {
        System.out.println(nome + " diz: Miau!");
    }

    // Descrição com mais detalhes sobre o gato
    @Override
    public String getDescricao() {
        return "Gato: " + super.getDescricao() + " | Cor: " + cor;
    }
}
