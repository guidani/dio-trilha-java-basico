public class ContaPoupanca extends Conta {

  public ContaPoupanca(Cliente cliente) {
    super(cliente);
  }

  @Override
  public void imprimirExtrato() {
    System.out.println("*".repeat(10) + " EXTRATO CONTA POUPANÇA " + "*".repeat(10));
    super.imprimirInfosComuns();
  }

}
