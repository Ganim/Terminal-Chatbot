import java.util.Scanner;

public class AcompanharPedido {
  public static void acompanharPedido(Scanner scanner) {
    System.out.print("\033[H\033[2J");
    System.out.flush();
    boolean back = false;
    while (!back) {

      System.out.println("Chatbot: Obrigado por comprar conosco! Sobre o seu pedido, como posso ajudar?");
      System.out.println("1. Ver status do pedido");
      System.out.println("2. Data estimada de entrega");
      System.out.println("3. Rastrear pedido");
      System.out.println("4. Voltar ao menu principal");
      System.out.println("--------------------");
      System.out.print("Escolha uma opção: ");
      int escolhaUsuario = scanner.nextInt();

      switch (escolhaUsuario) {
        case 1:
          System.out.println("\n");
          System.out.println("====================");
          System.out.println("Chatbot: Status do pedido: Em processamento.");
          System.out.println("====================");
          System.out.println("\n");
          break;
        case 2:
          System.out.println("\n");
          System.out.println("====================");
          System.out.println("Chatbot: Data estimada de entrega: 15/10/2024.");
          System.out.println("====================");
          System.out.println("\n");
          break;
        case 3:
          System.out.println("\n");
          System.out.println("====================");
          System.out.println("Chatbot: Rastreio: SE123456789BR.");
          System.out.println("====================");
          System.out.println("\n");
          break;
        case 4:
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
