package uninter;

// Classe abstrata que representa uma moeda genérica
public abstract class Moeda {

    // Atributo protegido, pode ser acessado por classes filhas (Real, Dolar, Euro)
    protected double valor;

    // Construtor da classe Moeda, que recebe um valor e armazena no atributo
    public Moeda(double valor) {
        this.valor = valor;
    }

    // Método abstrato que será implementado de forma diferente por cada moeda
    public abstract double converter();

    // Método para comparar se duas moedas são iguais (tipo e valor)
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Moeda) {
            Moeda outra = (Moeda) obj;
            return this.getClass().equals(outra.getClass()) && this.valor == outra.valor;
        }
        return false;
    }
}
