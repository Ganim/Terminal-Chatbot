import java.util.Scanner;

public class LojaChatbot {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("\033[H\033[2J");
    System.out.flush();
    boolean running = true;

    while (running) {
      System.out.println("Chatbot: Olá, eu sou o Javier, assistente virtual da loja. Como posso ajudar?");
      System.out.println("1. Informações da loja");
      System.out.println("2. Dúvida sobre um produto");
      System.out.println("3. Promoções");
      System.out.println("4. Falar com um vendedor");
      System.out.println("5. Atendimento pós-venda");
      System.out.println("6. Acompanhar pedido");
      System.out.println("7. Sair");
      System.out.println("--------------------");
      System.out.print("Escolha uma opção: ");
      int escolhaUsuario = scanner.nextInt();

      switch (escolhaUsuario) {
        case 1:
          InformacoesLoja.informacoesLoja(scanner);
          break;
        case 2:
          DuvidaProduto.duvidaProduto(scanner);
          break;
        case 3:
          Promocoes.promocoes(scanner);
          break;
        case 4:
          FalarVendedor.falarVendedor(scanner);
          break;
        case 5:
          AtendimentoPosVenda.atendimentoPosVenda(scanner);
          break;
        case 6:
          AcompanharPedido.acompanharPedido(scanner);
          break;
        case 7:
          System.out.println("\n");
          System.out.println("====================");
          System.out.println("Chatbot: Obrigado por utilizar o atendimento da loja!");
          System.out.println("====================");
          running = false;
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
    scanner.close();
  }
}
