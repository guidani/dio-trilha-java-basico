import java.util.ArrayList;
import java.util.List;

public class Banco {
  private String nome;
  private double saldo = 1000000.0;

  public double getSaldo() {
    return saldo;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  protected List<Conta> contas = new ArrayList<>();

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void adicionarCliente(Conta conta) {
    this.contas.add(conta);
  }

  public void listarClientes() {
    System.out.println("=== LISTA DE CLIENTES DO BANCO " + this.nome + "===");
    for (Conta conta : this.contas) {
      System.out.println(conta.cliente.getNome());
    }
  }

  protected void emprestar(double valor, Conta conta) {
    if (valor <= this.saldo) {
      conta.depositar(valor);
    }
  }
}
