package uninter;

// Classe Real herda de Moeda
public class Real extends Moeda {

    // Construtor que chama o construtor da classe mãe (Moeda)
    public Real(double valor) {
        super(valor);
    }

    // Implementação do método converter, retornando o valor sem alteração
    @Override
    public double converter() {
        return valor;
    }

    // Método toString personalizado para exibir a moeda
    @Override
    public String toString() {
        return "Real: R$ " + valor;
    }
}
