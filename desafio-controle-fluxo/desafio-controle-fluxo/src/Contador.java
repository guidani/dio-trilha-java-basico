import java.util.Scanner;

public class Contador {
  public static void main(String[] args) throws ParametrosInvalidosException {
    Scanner terminal = new Scanner(System.in);

    int parametroUm = terminal.nextInt();
    int parametroDois = terminal.nextInt();

    try {
      contar(parametroUm, parametroDois);
    } catch (ParametrosInvalidosException e) {
      System.out.println(e.getCause());
      System.out.println(e.getMessage());
      throw new ParametrosInvalidosException("Erro");
    }
  }

  private static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
    if (parametroUm > parametroDois) {
      return;
    }

    int contagem = parametroDois - parametroUm;
    for (int i = 0; i < contagem; i++) {
      System.out.println("Imprimindo o numero " + i);
    }

  }
}
