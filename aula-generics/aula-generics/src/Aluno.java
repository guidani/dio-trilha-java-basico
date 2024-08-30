public class Aluno extends Pessoa {
  public String escola;
  public String turma;

  public Aluno(){};

  public Aluno(String nome, Integer idade, String escola, String turma) {
    super(nome, idade);
    this.escola = escola;
    this.turma = turma;
  }
  

  
}
