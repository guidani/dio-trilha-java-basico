import java.util.ArrayList;
import java.util.List;

public class UpperBoundedWildcard {

  public static void main(String[] args) {
    //
    Aluno a1 = new Aluno("Guilherme", 28, "escola", "A1");
    Aluno a2 = new Aluno("Daniel", 28, "escola", "A2");
    List<Aluno> alunos = new ArrayList<Aluno>();
    alunos.add(a1);
    alunos.add(a2);
    imprimeListaUpperBoundedWildcard(alunos);

    FuncionarioTerceirizado f1 = new FuncionarioTerceirizado("Ajudante Geral", "ServiçosGerais");
    List<FuncionarioTerceirizado> listaFuncionarioTerceirizados = new ArrayList<>();
    listaFuncionarioTerceirizados.add(f1);
    // Erro
    // imprimeListaUpperBoundedWildcard(f1);
  }

  /**
   * Permite apenas uma lista de objeto que extendem de Pessoa
   */
  static void imprimeListaUpperBoundedWildcard(List<? extends Pessoa> lista) {
    for (Object obj : lista) {
      System.out.println(obj);
    }
  }

}
