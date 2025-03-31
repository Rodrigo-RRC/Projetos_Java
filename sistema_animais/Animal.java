package sistema_animais;

// Classe abstrata que representa um animal genérico
public abstract class Animal {
    protected String nome;
    protected int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Método abstrato que será implementado pelas subclasses
    public abstract void emitirSom();

    // Retorna uma descrição básica do animal
    public String getDescricao() {
        return nome + " - " + idade + " anos";
    }
}
