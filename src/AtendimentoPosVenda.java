import java.util.Scanner;

public class AtendimentoPosVenda {
  public static void atendimentoPosVenda(Scanner scanner) {
    System.out.print("\033[H\033[2J");
    System.out.flush();
    boolean back = false;
    while (!back) {

      System.out
          .println("Chatbot: Se está tendo um problema, não se preocupe. Vamos resolver! Sobre o que quer falar?");
      System.out.println("1. Troca de produto");
      System.out.println("2. Devolução");
      System.out.println("3. Assistência técnica");
      System.out.println("4. Reclamação");
      System.out.println("5. Voltar ao menu principal");
      System.out.println("--------------------");
      System.out.print("Escolha uma opção: ");
      int escolhaUsuario = scanner.nextInt();

      switch (escolhaUsuario) {
        case 1:
          System.out.println("\n");
          System.out.println("====================");
          System.out.println("Chatbot: Para trocas, entre em contato pelo email trocas@loja.com.br.");
          System.out.println("====================");
          System.out.println("\n");
          break;
        case 2:
          System.out.println("\n");
          System.out.println("====================");
          System.out.println("Chatbot: Para devoluções, acesse nosso portal de devoluções.");
          System.out.println("====================");
          System.out.println("\n");
          break;
        case 3:
          System.out.println("\n");
          System.out.println("====================");
          System.out.println("Chatbot: Assistência técnica disponível para produtos eletrônicos.");
          System.out.println("====================");
          System.out.println("\n");
          break;
        case 4:
          System.out.println("\n");
          System.out.println("====================");
          System.out.println("Chatbot: Para reclamações, entre em contato pelo telefone (62) 1234-5678.");
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
