import java.util.Scanner;

public class DuvidaProduto {
  public static void duvidaProduto(Scanner scanner) {
    System.out.print("\033[H\033[2J");
    System.out.flush();
    boolean back = false;
    while (!back) {
      System.out.println("Chatbot: O que você gostaria de saber sobre nosso produto?");
      System.out.println("1. Tamanhos disponíveis");
      System.out.println("2. Cores disponíveis");
      System.out.println("3. Preço");
      System.out.println("4. Disponibilidade em estoque");
      System.out.println("5. Voltar ao menu principal");
      System.out.println("--------------------");
      System.out.print("Escolha uma opção: ");
      int escolhaUsuario = scanner.nextInt();

      switch (escolhaUsuario) {
        case 1:
          System.out.println("\n");
          System.out.println("====================");
          System.out.println("Chatbot: Tamanhos disponíveis: P, M, G.");
          System.out.println("====================");
          System.out.println("\n");
          break;
        case 2:
          System.out.println("\n");
          System.out.println("====================");
          System.out.println("Chatbot: Cores disponíveis: Preto, Branco, Azul.");
          System.out.println("====================");
          System.out.println("\n");
          break;
        case 3:
          System.out.println("\n");
          System.out.println("====================");
          System.out.println("Chatbot: Preços variam de R$50,00 a R$200,00.");
          System.out.println("====================");
          System.out.println("\n");
          break;
        case 4:
          System.out.println("\n");
          System.out.println("====================");
          System.out.println("Chatbot: Estoque disponível.");
          System.out.println("====================");
          System.out.println("\n");
          break;
        case 5:
          System.out.print("\033[H\033[2J");
          System.out.flush();
          back = true;
          break;
        default:
          System.out.println("\n");
          System.out.println("====================");
          System.out.println("Chatbot: Opção inválida. Tente novamente.");
          System.out.println("====================");
          System.out.println("\n");
          break;
      }
    }
  }
}
