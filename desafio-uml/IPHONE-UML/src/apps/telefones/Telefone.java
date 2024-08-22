package apps.telefones;

public class Telefone implements ITelefone {

  @Override
  public void atender() {
    System.out.println("Atendendo Ligação.");

  }

  @Override
  public void iniciarCorreioDeVoz() {

    System.out.println("Iniciando correio de voz");
  }

  @Override
  public void ligar() {
    System.out.println("Realizando Ligação.");

  }

}
