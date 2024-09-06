package com.dio.listasCirculares;

public class ListaCircular<T> {
  private No<T> cabeca;
  private No<T> rabo;
  private int tamanhoLista;

  public ListaCircular() {
    this.rabo = null;
    this.cabeca = null;
    this.tamanhoLista = 0;
  }

  void add(T conteudo) {
    No<T> novoNo = new No<T>(conteudo);
    if (this.tamanhoLista == 0) {
      this.cabeca = novoNo;
      this.rabo = this.cabeca;
      this.cabeca.setNoProximo(rabo);
    } else {
      novoNo.setNoProximo(this.rabo);
      this.cabeca.setNoProximo(novoNo);
      this.rabo = novoNo;
    }
    this.tamanhoLista++;
  }

  void remove(int index) {
    if (index >= this.tamanhoLista) {
      throw new IndexOutOfBoundsException("IndexOutOfBoundsException");
    }
    No<T> noAux = this.rabo;
    if (index == 0) {
      this.rabo = this.rabo.getNoProximo();
      this.cabeca.setNoProximo(this.rabo);
    } else if (index == 1) {
      this.rabo.setNoProximo(this.rabo.getNoProximo().getNoProximo());
    } else {
      for (int i = 0; i < index - 1; i++) {
        noAux = noAux.getNoProximo();
      }
      noAux.setNoProximo(noAux.getNoProximo().getNoProximo());
    }
    this.tamanhoLista--;
  }

  T get(int index) {
    return this.getNo(index).getConteudo();
  }

  private No<T> getNo(int index) {
    if (this.isEmpty()) {
      throw new IndexOutOfBoundsException("A lista está vazia");
    }

    if (index == 0) {
      return this.rabo;
    }

    No<T> noAux = this.rabo;
    for (int i = 0; (i < index) && (noAux != null); i++) {
      noAux = noAux.getNoProximo();
    }
    return noAux;
  }

  boolean isEmpty() {
    return this.tamanhoLista == 0 ? true : false;
  }

  int size() {
    return this.tamanhoLista;
  }

  @Override
  public String toString() {
    String str = "";
    No<T> noAuxiliar = this.rabo;
    for (int i = 0; i < this.size(); i++) {
      str += "No > Conteudo=" + noAuxiliar.getConteudo() + ";-->";
      noAuxiliar = noAuxiliar.getNoProximo();
    }
    str += this.size() != 0 ? "(Retorna ao inicio)" : "[]";
    return str;
  }

}
