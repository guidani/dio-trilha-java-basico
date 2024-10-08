import lombok.Getter;

public abstract class Conta implements IConta {

  private static final int AGENCIA_PADRA = 1;
  private static int SEQUENCIAL = 1;

  protected Cliente cliente;

  protected @Getter int agencia;

  protected @Getter int numero;

  private @Getter double saldo;

  public Conta(Cliente cliente) {
    this.agencia = Conta.AGENCIA_PADRA;
    this.numero = SEQUENCIAL++;
    this.cliente = cliente;
  }

  @Override
  public void sacar(double valor) {
    if (valor <= this.saldo) {
      this.saldo -= valor;
    }
  }

  @Override
  public void depositar(double valor) {
    saldo += valor;
  }

  @Override
  public void transferir(double valor, Conta contaDestino) {
    // Verificar se tem saldo suficiente
    if (valor <= this.saldo) {
      this.sacar(valor);
      contaDestino.depositar(valor);
    }
  }

  protected void imprimirInfosComuns() {
    System.out.println("Agencia: " + this.agencia);
    System.out.println("Numero: " + this.numero);
    System.out.println("Cliente: " + this.cliente.getNome());
    System.out.println("Saldo: " + this.getSaldo());
  }

}
