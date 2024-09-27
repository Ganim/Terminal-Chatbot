import java.util.Scanner;

public class FalarVendedor {
  public static void falarVendedor(Scanner scanner) {
    System.out.print("\033[H\033[2J");
    System.out.flush();
    boolean back = false;
    while (!back) {

      System.out.println("Chatbot: Como você gostaria de ser atendido pelos nossos vendedores?");
      System.out.println("1. Solicitar contato de um vendedor por chat");
      System.out.println("2. Solicitar contato por telefone");
      System.out.println("3. Solicitar atendimento por e-mail");
      System.out.println("4. Voltar ao menu principal");
      System.out.println("--------------------");
      System.out.print("Escolha uma opção: ");
      int escolhaUsuario = scanner.nextInt();

      switch (escolhaUsuario) {
        case 1:
          System.out.println("\n");
          System.out.println("====================");
          System.out.println("Chatbot: Um vendedor entrará em contato pelo chat em breve.");
          System.out.println("====================");
          System.out.println("\n");
          break;
        case 2:
          System.out.println("\n");
          System.out.println("====================");
          System.out.println("Chatbot: Um vendedor ligará para você em breve.");
          System.out.println("====================");
          System.out.println("\n");
          break;
        case 3:
          System.out.println("\n");
          System.out.println("====================");
          System.out.println("Chatbot: Envie sua dúvida para atendimento@loja.com.br.");
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
