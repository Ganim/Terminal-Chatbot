import java.util.Scanner;

public class Promocoes {
  public static void promocoes(Scanner scanner) {
    System.out.print("\033[H\033[2J");
    System.out.flush();
    boolean back = false;
    while (!back) {
      System.out.println("Chatbot: Que bom que está buscando nossas promoções! Como posso te ajudar?");
      System.out.println("1. Ver promoções atuais");
      System.out.println("2. Ver cupons de desconto disponíveis");
      System.out.println("3. Informações sobre a Black Friday");
      System.out.println("4. Voltar ao menu principal");
      System.out.println("--------------------");
      System.out.print("Escolha uma opção: ");
      int escolhaUsuario = scanner.nextInt();

      switch (escolhaUsuario) {
        case 1:
          System.out.println("\n");
          System.out.println("====================");
          System.out.println("Chatbot: Promoções atuais: 30% de desconto em camisetas.");
          System.out.println("====================");
          System.out.println("\n");
          break;
        case 2:
          System.out.println("\n");
          System.out.println("====================");
          System.out.println("Chatbot: Cupons disponíveis: CUPOM10 para 10% de desconto.");
          System.out.println("====================");
          System.out.println("\n");
          break;
        case 3:
          System.out.println("\n");
          System.out.println("====================");
          System.out.println("Chatbot: Black Friday: Descontos de até 50% na loja toda.");
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
