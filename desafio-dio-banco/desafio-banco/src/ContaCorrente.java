public class ContaCorrente extends Conta {

  public ContaCorrente(Cliente cliente) {
    super(cliente);
  }

  @Override
  public void imprimirExtrato() {
    System.out.println("*".repeat(10) + " EXTRATO CONTA CORRENTE " + "*".repeat(10));
    super.imprimirInfosComuns();
  }

}
