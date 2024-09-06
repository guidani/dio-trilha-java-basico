package com.dio.listasCirculares;

public class main {
  public static void main(String[] args) {
    ListaCircular<String> lc = new ListaCircular<>();
    lc.add("1");
    lc.add("2");
    lc.add("3");
    lc.add("4");
    lc.remove(0);
    System.out.println(lc.toString());
  }
}
