package uninter;

// Classe Dolar herda de Moeda
public class Dolar extends Moeda {

    public Dolar(double valor) {
        super(valor);
    }

    // Converte o valor de Dólar para Real com base em uma taxa fictícia
    @Override
    public double converter() {
        return valor * 5.0;
    }

    @Override
    public String toString() {
        return "Dólar: US$ " + valor;
    }
}
