package apps.reprodutoresMusicas;

public class ReprodutorMusical implements IReprodutorMusical {

  @Override
  public void pausarMusica() {

    System.out.println("Pausando Musica.");
  }

  @Override
  public void selecionarMusica() {
    System.out.println("Selecionando Musica.");

  }

  @Override
  public void tocarMusica() {
    System.out.println("Tocando Musica.");

  }

}
