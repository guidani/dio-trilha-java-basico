package com.dio.listasEncadeadas;

public class main {
  public static void main(String[] args) {
    ListaEncadeada<String> l = new ListaEncadeada<>();

    l.add("T1");
    l.add("T2");
    l.add("T3");
    l.add("T4");

    System.out.println(l.get(0));

    System.out.println(l.toString());

    System.out.println(l.remove(2));
    System.out.println(l.toString());
  }
}
