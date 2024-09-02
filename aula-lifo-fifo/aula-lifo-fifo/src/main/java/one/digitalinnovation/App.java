package main.java.one.digitalinnovation;

import main.java.one.digitalinnovation.pilha.No;
import main.java.one.digitalinnovation.pilha.Pilha;

public class App {
    public static void main(String[] args) throws Exception {
        Pilha p = new Pilha();

        p.Push(new No(1));
        p.Push(new No(2));
        p.Push(new No(3));
        p.Push(new No(4));
        p.Push(new No(5));
        p.Push(new No(6));

        System.out.println(p);

        p.pop();
        p.pop();

        System.out.println(p);

        p.top();

        System.out.println(p);
    }
}
