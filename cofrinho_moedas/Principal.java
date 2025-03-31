package uninter;

import java.util.Scanner;

// Classe principal que executa o menu interativo
public class Principal {

    public static void main(String[] args) {
        Cofrinho cofrinho = new Cofrinho();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        // Loop principal do menu
        do {
            System.out.println("\n=== COFRINHO DE MOEDAS ===");
            System.out.println("1 - Adicionar moeda");
            System.out.println("2 - Remover moeda");
            System.out.println("3 - Listar moedas");
            System.out.println("4 - Calcular total convertido para Real");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor: ");
                    double vAdd = scanner.nextDouble();
                    System.out.print("Escolha o tipo (1-Real, 2-Dólar, 3-Euro): ");
                    int tAdd = scanner.nextInt();
                    Moeda mAdd = criarMoeda(tAdd, vAdd);
                    if (mAdd != null) cofrinho.adicionarMoeda(mAdd);
                    break;

                case 2:
                    System.out.print("Digite o valor: ");
                    double vRem = scanner.nextDouble();
                    System.out.print("Escolha o tipo (1-Real, 2-Dólar, 3-Euro): ");
                    int tRem = scanner.nextInt();
                    Moeda mRem = criarMoeda(tRem, vRem);
                    if (mRem != null) cofrinho.removerMoeda(mRem);
                    break;

                case 3:
                    cofrinho.listarMoedas();
                    break;

                case 4:
                    double total = cofrinho.totalConvertido();
                    System.out.printf("Total convertido: R$ %.2f\n", total);
                    break;

                case 0:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        scanner.close();
    }

    // Método auxiliar que cria a moeda com base no tipo informado
    public static Moeda criarMoeda(int tipo, double valor) {
        switch (tipo) {
            case 1: return new Real(valor);
            case 2: return new Dolar(valor);
            case 3: return new Euro(valor);
            default:
                System.out.println("Tipo inválido!");
                return null;
        }
    }
}
