public class ParametrosInvalidosException extends Exception {
  // Construtor sem parâmetros
  public ParametrosInvalidosException() {
    super();
  }

  // Construtor que aceita uma mensagem personalizada
  public ParametrosInvalidosException(String mensagem) {
    super(mensagem);
  }

  // Construtor que aceita uma mensagem e uma causa (outra exceção)
  public ParametrosInvalidosException(String mensagem, Throwable causa) {
    super(mensagem, causa);
  }

  // Construtor que aceita apenas uma causa
  public ParametrosInvalidosException(Throwable causa) {
    super(causa);
  }
}
