package br.com.digitalinnovationone.pureJava.singletonPattern;

public class Main {

    public static void main(String[] args) {
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        SingletonLazy lazy2 = SingletonLazy.getInstancia();
        System.out.println(lazy2);

        System.out.println("-".repeat(50));
        SingletonEager eager = SingletonEager.getInstance();
        System.out.println(eager);
        SingletonEager eager2 = SingletonEager.getInstance();
        System.out.println(eager2);

        System.out.println("-".repeat(50));
        SingletonLazyHolder holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);
        SingletonLazyHolder holder2 = SingletonLazyHolder.getInstancia();
        System.out.println(holder2);
    }
}
