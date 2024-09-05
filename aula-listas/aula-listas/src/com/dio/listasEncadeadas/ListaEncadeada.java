package com.dio.listasEncadeadas;

public class ListaEncadeada<T> {
  No<T> referenciaEntrada;

  ListaEncadeada() {
    this.referenciaEntrada = null;
  }

  T remove(int index) {
    No<T> noPivo = this.getNo(index);
    if (index == 0) {
      referenciaEntrada = noPivo.getProximoNo();
      return noPivo.getConteudo();
    }

    No<T> noAnterior = getNo(index - 1);
    noAnterior.setProximoNo(noPivo.getProximoNo());
    return noPivo.getConteudo();
  }

  T get(int index) {
    return getNo(index).getConteudo();
  }

  private No<T> getNo(int index) {

    validaIndice(index);

    No<T> noAuxiliar = referenciaEntrada;
    No<T> noRetorno = null;

    for (int i = 0; i <= index; i++) {
      noRetorno = noAuxiliar;
      noAuxiliar = noAuxiliar.getProximoNo();
    }
    return noRetorno;
  }

  private void validaIndice(int index) {
    if (index >= size()) {
      throw new IndexOutOfBoundsException("Não existe conteúdo no indice passado: " + index);
    }
  }

  public void add(T conteudo) {
    No<T> novoNo = new No<>(conteudo);
    if (this.isEmpty()) {
      referenciaEntrada = novoNo;
      return;
    }
    No<T> noAuxiliar = referenciaEntrada;

    for (int i = 0; i < this.size() - 1; i++) {
      noAuxiliar = noAuxiliar.getProximoNo();
    }

    noAuxiliar.setProximoNo(novoNo);
  }

  int size() {
    int tamanhoLista = 0;
    No<T> referenciaAux = referenciaEntrada;
    while (true) {
      if (referenciaAux != null) {
        tamanhoLista++;
        if (referenciaAux.getProximoNo() != null) {
          referenciaAux = referenciaAux.getProximoNo();
        } else {
          break;
        }
      } else {
        break;
      }
    }
    return tamanhoLista;
  }

  boolean isEmpty() {
    return referenciaEntrada == null ? true : false;
  }

  @Override
  public String toString() {
    String str = "";
    No<T> noAuxiliar = referenciaEntrada;
    for (int i = 0; i < this.size(); i++) {
      str += "No [conteudo=" + noAuxiliar.getConteudo() + "]-->";
      noAuxiliar = noAuxiliar.getProximoNo();
    }
    str += "null";
    return str;

  }

}
