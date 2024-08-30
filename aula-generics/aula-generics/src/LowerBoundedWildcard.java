import java.util.ArrayList;
import java.util.List;

public class LowerBoundedWildcard {
  public static void main(String[] args) {
    Aluno a1 = new Aluno("Guilherme", 28, "escola", "A1");
    Aluno a2 = new Aluno("Daniel", 28, "escola", "A2");
    List<Aluno> alunos = new ArrayList<Aluno>();
    alunos.add(a1);
    alunos.add(a2);
    // Ocorre erro
    // The method imprimeListaLowerBoundedWildcard(List<? super Pessoa>) in the type
    // LowerBoundedWildcard is not applicable for the arguments (List<Aluno>)
    // imprimeListaLowerBoundedWildcard(alunos);

    Pessoa p1 = new Pessoa("Guilherme", 28);
    List<Pessoa> lp = new ArrayList<Pessoa>();
    lp.add(p1);
    imprimeListaLowerBoundedWildcard(lp);
  }

  /**
   * Permi apenas da classe Pesso e hierarquias acima.
   * 
   * @param lista
   */
  static void imprimeListaLowerBoundedWildcard(List<? super Pessoa> lista) {
    for (Object obj : lista) {
      System.out.println(obj);
    }
  }
}
