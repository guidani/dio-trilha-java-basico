package com.dio.listasDuplamenteEncadeadas;

public class ListaDuplamenteEncadeada<T> {

  private NoDuplo<T> primeiroNo;
  private NoDuplo<T> ultimoNo;

  private int tamanhoLista;

  ListaDuplamenteEncadeada() {
    this.primeiroNo = null;
    this.ultimoNo = null;
    this.tamanhoLista = 0;
  }

  int size() {
    return this.tamanhoLista;
  }

  void add(T elemento) {
    NoDuplo<T> novoNo = new NoDuplo<>(elemento);
    novoNo.setNoProximo(null);
    novoNo.setNoPrevio(ultimoNo);
    if (primeiroNo == null) {
      primeiroNo = novoNo;
    }
    if (ultimoNo != null) {
      ultimoNo.setNoProximo(novoNo);
    }
    ultimoNo = novoNo;
    tamanhoLista++;
  }

  void add(int index, T elemento) {
    NoDuplo<T> noAuxiliar = getNo(index);
    NoDuplo<T> novoNo = new NoDuplo<>(elemento);
    novoNo.setNoProximo(noAuxiliar);

    if (novoNo.getNoProximo() != null) {
      novoNo.setNoPrevio(noAuxiliar.getNoPrevio());
      novoNo.getNoProximo().setNoPrevio(novoNo);
    } else {
      novoNo.setNoPrevio(ultimoNo);
      ultimoNo = novoNo;
    }

    if (index == 0) {
      primeiroNo = novoNo;
    } else {
      novoNo.getNoPrevio().setNoProximo(novoNo);
    }
    tamanhoLista++;
  }

  void remove(int index) {
    if (index == 0) {
      primeiroNo = primeiroNo.getNoProximo();
      if (primeiroNo != null) {
        primeiroNo.setNoPrevio(null);
      }
    } else {
      NoDuplo<T> noAuxiliar = getNo(index);
      noAuxiliar.getNoPrevio().setNoProximo(noAuxiliar.getNoProximo());
      if (noAuxiliar != ultimoNo) {
        noAuxiliar.getNoProximo().setNoPrevio(noAuxiliar.getNoPrevio());
      } else {
        ultimoNo = noAuxiliar;
      }
    }
    this.tamanhoLista--;
  }

  T get(int index) {
    return this.getNo(index).getConteudo();
  }

  private NoDuplo<T> getNo(int index) {
    NoDuplo<T> noAux = primeiroNo;
    for (int i = 0; (i < index) && (noAux != null); i++) {
      noAux = noAux.getNoProximo();
    }
    return noAux;
  }

  @Override
  public String toString() {
    String retorno = "";
    NoDuplo<T> noAux = primeiroNo;
    for (int i = 0; i < size(); i++) {
      retorno += "No > Conteudo: " + noAux.getConteudo() + "-->";
      noAux = noAux.getNoProximo();
    }
    retorno += "null";
    return retorno;
  }

}
