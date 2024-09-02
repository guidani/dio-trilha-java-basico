package main.java.one.digitalinnovation.filas;

public class Fila {
  private No head;

  public Fila() {
    this.head = null;
  }

  public Object first() {
    if (!this.isEmpty()) {
      No primeiroNo = head;
      while (true) {
        if (primeiroNo.getRefNo() != null) {
          primeiroNo = primeiroNo.getRefNo();
        } else {
          break;
        }
      }
      return primeiroNo.getObject();
    }
    return null;
  }

  public Object dequeue() {
    if (!this.isEmpty()) {
      No primeiroNo = head;
      No aux = head;
      while (true) {
        if (primeiroNo.getRefNo() != null) {
          aux = primeiroNo;
          primeiroNo = primeiroNo.getRefNo();
        } else {
          aux.setRefNo(null);
          break;
        }
      }
      return primeiroNo.getObject();
    }
    return null;
  }

  public void enqueue(Object obj) {
    No novoNo = new No(obj);
    novoNo.setRefNo(head);
    head = novoNo;
  }

  public Boolean isEmpty() {
    return head == null ? true : false;
  }

  @Override
  public String toString() {
    String retorno = "";
    No aux = head;

    if (head != null) {
      while (true) {
        retorno += "[No{objeto=" + aux.getObject() + "}] ---> ";
        if (aux.getRefNo() != null) {
          aux = aux.getRefNo();
        } else {
          retorno += "null";
          break;
        }
      }
    } else {
      retorno += "null";
    }
    return retorno;
  }

}
