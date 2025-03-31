package sistema_animais;

import java.util.Scanner;

// Classe principal com menu de interação
public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SistemaCadastro sistema = new SistemaCadastro();
        int opcao;

        do {
            System.out.println("\n----- MENU -----");
            System.out.println("1 - Adicionar Cachorro");
            System.out.println("2 - Adicionar Gato");
            System.out.println("3 - Listar Animais");
            System.out.println("4 - Emitir sons");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine(); // Limpa o buffer

            switch (opcao) {
                case 1:
                    System.out.print("Nome do cachorro: ");
                    String nomeC = sc.nextLine();
                    System.out.print("Idade: ");
                    int idadeC = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Raça: ");
                    String raca = sc.nextLine();
                    sistema.adicionarAnimal(new Cachorro(nomeC, idadeC, raca));
                    break;

                case 2:
                    System.out.print("Nome do gato: ");
                    String nomeG = sc.nextLine();
                    System.out.print("Idade: ");
                    int idadeG = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Cor: ");
                    String cor = sc.nextLine();
                    sistema.adicionarAnimal(new Gato(nomeG, idadeG, cor));
                    break;

                case 3:
                    sistema.listarAnimais();
                    break;

                case 4:
                    sistema.emitirSons();
                    break;

                case 0:
                    System.out.println("Saindo do sistema.");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        sc.close();
    }
}
