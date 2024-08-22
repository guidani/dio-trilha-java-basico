package apps.navegadores;

public class Navegador implements INavegador {

  @Override
  public void abrirNovaAba() {

    System.out.println("Abrindo nova aba.");
  }

  @Override
  public void atualizarPagina() {

    System.out.println("Atualizando Página.");
  }

  @Override
  public void exibirPagina() {

    System.out.println("Exibindo Página.");
  }

}
