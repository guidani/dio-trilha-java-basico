package main.java.one.digitalinnovation;

import main.java.one.digitalinnovation.filas.Fila;
import main.java.one.digitalinnovation.pilha.No;
import main.java.one.digitalinnovation.pilha.Pilha;

public class App {
    public static void main(String[] args) throws Exception {
        testaFila();
    }

    static void testaPilha() {
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

    static void testaFila() {
        Fila<String> f = new Fila<>();
        f.enqueue("A");
        f.enqueue("B");
        f.enqueue("C");
        f.enqueue("D");

        System.out.println(f);
        System.out.println(f.dequeue());
        System.out.println(f);
        f.enqueue("E");
        System.out.println(f);
        System.out.println(f.first());
        System.out.println(f);
    }
}
