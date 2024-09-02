package main.java.one.digitalinnovation.pilha;

public class No {
  private int dado;
  private No refNo;

  public No() {
  }

  public No(int dado) {
    this.dado = dado;
  }

  public int getDado() {
    return dado;
  }

  public void setDado(int dado) {
    this.dado = dado;
  }

  public No getRefNo() {
    return refNo;
  }

  public void setRefNo(No refNo) {
    this.refNo = refNo;
  }

  @Override
  public String toString() {
    return "No [dado=" + dado + "]";
  }

  
}
