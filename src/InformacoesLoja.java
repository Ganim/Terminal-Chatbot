import java.util.Scanner;

public class InformacoesLoja {
  public static void informacoesLoja(Scanner scanner) {
    // The code `System.out.print("\033[H\033[2J"); System.out.flush();` is used to
    // clear the console screen.
    System.out.print("\033[H\033[2J");
    System.out.flush();
    boolean back = false;
    while (!back) {
      System.out.println("Chatbot: Qual informação da loja você deseja saber?");
      System.out.println("1. Endereço");
      System.out.println("2. Horário de funcionamento");
      System.out.println("3. Contato");
      System.out.println("4. Voltar ao menu principal");
      System.out.println("--------------------");
      System.out.print("Escolha uma opção: ");
      int escolhaUsuario = scanner.nextInt();

      switch (escolhaUsuario) {
        case 1:
          System.out.println("\n");
          System.out.println("====================");
          System.out.println("Chatbot: Nosso endereço fica na Rua Exemplo, 123, Centro.");
          System.out.println("====================");
          System.out.println("\n");
          break;
        case 2:
          System.out.println("\n");
          System.out.println("====================");
          System.out.println("Chatbot: Nosso horário de funcionamento é de Segunda a sexta, das 9h às 18h.");
          System.out.println("====================");
          System.out.println("\n");
          break;
        case 3:
          System.out.println("\n");
          System.out.println("====================");
          System.out.println("Chatbot: Nosso telefone de contato é: (62) 1234-5678");
          System.out.println("Chatbot: Nosso e-mail de contato é: email@loja.com.br");
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
