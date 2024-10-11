package br.com.digitalinnovationone.pureJava.singletonPattern;

public class SingletonEager {

    private static final SingletonEager instancia = new SingletonEager();

    private SingletonEager(){
        super();
    }

    public static SingletonEager getInstance(){
        return instancia;
    }
}
