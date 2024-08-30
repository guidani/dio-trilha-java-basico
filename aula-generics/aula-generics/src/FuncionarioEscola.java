public class FuncionarioEscola extends Pessoa {

  public String funcao;
  public double salario;

  public FuncionarioEscola(String nome, Integer idade, String funcao, double salario) {
    super(nome, idade);
    this.funcao = funcao;
    this.salario = salario;
  }

}
