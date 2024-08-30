import java.util.ArrayList;
import java.util.List;

public class UnknownWildcard {

  public static void main(String[] args) {

    Aluno a1 = new Aluno("Guilherme", 28, "escola", "A1");
    Aluno a2 = new Aluno("Daniel", 28, "escola", "A2");
    List<Aluno> alunos = new ArrayList<Aluno>();
    alunos.add(a1);
    alunos.add(a2);
    imprimeListaUnknownWildcard(alunos);
  }

  static void imprimeListaUnknownWildcard(List<?> lista) {
    for (Object obj : lista) {
      System.out.println(obj);
    }
  }
}
