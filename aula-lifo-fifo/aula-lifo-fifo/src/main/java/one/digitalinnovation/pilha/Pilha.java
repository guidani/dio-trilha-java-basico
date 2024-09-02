package main.java.one.digitalinnovation.pilha;

public class Pilha {
  private No refNoEntradaPilha;

  public Pilha() {
    this.refNoEntradaPilha = null;
  }

  public No pop() {
    if (!isEmpty()) {
      // Cria uma copia do No atual para o qual está sendo apontado (copia da
      // referencia)
      No noPoped = this.refNoEntradaPilha;
      // O No atual, aponta para o No que está logo abaixo dele na pilha.
      // Agora o ponteiro da classe Pilha irá apontar para o No logo abaixo.
      refNoEntradaPilha = refNoEntradaPilha.getRefNo();
      return noPoped;
    }
    return null;
  }

  public void Push(No novoNo) {
    No temp = refNoEntradaPilha;
    refNoEntradaPilha = novoNo;
    refNoEntradaPilha.setRefNo(temp);
  }

  public No top() {
    return this.refNoEntradaPilha;
  }

  public boolean isEmpty() {
    return (this.refNoEntradaPilha == null) ? true : false;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("-".repeat(10) + " PILHA " + "-".repeat(10) + "\n");
    No noAuxiliar = refNoEntradaPilha;
    while (true) {
      if (noAuxiliar != null) {
        sb.append("[No {dado=" + noAuxiliar.getDado() + "}]\n");
        noAuxiliar = noAuxiliar.getRefNo();
      } else {
        break;
      }
    }
    String s = sb.toString();
    return s;
  }

}
