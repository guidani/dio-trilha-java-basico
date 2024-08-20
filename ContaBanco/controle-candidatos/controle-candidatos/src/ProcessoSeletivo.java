import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
  public static ArrayList<String> selecionados = new ArrayList<>();

  public static void main(String[] args) {
    analisarCandidato(2000.0);
    selecaoCandidatos();
    imprimirCandidatos();
    ligarParaCandidatos();

  }

  private static void ligarParaCandidatos() {
    System.out.println("------ LIGANDO PARA CANDIDATOS ------");
    for (int i = 0; i < selecionados.size(); i++) {
      System.out.println("LIGANDO PARA: " + selecionados.get(i));
      // boolean atendeu = false;
      int nTentativa = 0;
      while (nTentativa < 3) {
        int vf = ThreadLocalRandom.current().nextInt(0, 2);
        if (vf == 0) {
          System.out.println("Candidato não atendeu.");
        } else {
          System.out.println("Candidato atendeu.");
          break;
        }
        nTentativa++;
      }
    }
  }

  static void imprimirCandidatos() {
    System.out.println("----------------------------");
    for (String i : selecionados) {
      System.out.println(i);
    }
    System.out.println("----------------------------");
  }

  public static void selecaoCandidatos() {
    String[] candidatos = { "FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA",
        "JORGE" };

    int candidatosSelecionados = 0;
    int candidatoAtual = 0;
    double salarioBase = 2000.0;
    while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
      String candidato = candidatos[candidatoAtual];
      double salarioPretendido = valorPretendido();
      System.out.println("O candidato " + candidato + " Solicitou este valor de salário " + salarioPretendido);
      if (salarioBase >= salarioPretendido) {
        System.out.println("O candidato " + candidato + " foi selecionado para a vaga.");
        selecionados.add(candidato);
        candidatosSelecionados++;
      }
      candidatoAtual++;
    }
  }

  static void analisarCandidato(double salarioPretendido) {
    double salarioBase = 2000.0;
    if (salarioBase > salarioPretendido)
      System.out.println("Ligar pra o candidato.");
    else if (salarioBase == salarioPretendido)
      System.out.println("ligar para o candidato com contra proposta.");
    else
      System.out.println("Aguardando resultado dos demais candidatos.");
  }

  static double valorPretendido() {
    return ThreadLocalRandom.current().nextDouble(1800, 2200);
  }
}
