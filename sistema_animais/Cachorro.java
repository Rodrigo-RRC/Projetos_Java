package sistema_animais;

// Classe que herda de Animal
public class Cachorro extends Animal {
    private String raca;

    public Cachorro(String nome, int idade, String raca) {
        super(nome, idade);
        this.raca = raca;
    }

    // Implementação do método emitirSom para cachorro
    @Override
    public void emitirSom() {
        System.out.println(nome + " diz: Au Au!");
    }

    // Descrição com mais detalhes sobre o cachorro
    @Override
    public String getDescricao() {
        return "Cachorro: " + super.getDescricao() + " | Raça: " + raca;
    }
}
