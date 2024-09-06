package com.dio.listasDuplamenteEncadeadas;

public class main {
  public static void main(String[] args) {
    ListaDuplamenteEncadeada lde = new ListaDuplamenteEncadeada<>();

    lde.add("A");
    lde.add("B");
    lde.add("C");
    lde.add("D");
    lde.add("E");

    System.out.println(lde.toString());

    lde.remove(0);

    System.out.println(lde.toString());

    lde.add(3, "Hi");

    System.out.println(lde.toString());
  }
}
