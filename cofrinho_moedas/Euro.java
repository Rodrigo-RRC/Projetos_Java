package uninter;

// Classe Euro herda de Moeda
public class Euro extends Moeda {

    public Euro(double valor) {
        super(valor);
    }

    // Converte Euro para Real com uma taxa fictícia
    @Override
    public double converter() {
        return valor * 6.0;
    }

    @Override
    public String toString() {
        return "Euro: € " + valor;
    }
}
