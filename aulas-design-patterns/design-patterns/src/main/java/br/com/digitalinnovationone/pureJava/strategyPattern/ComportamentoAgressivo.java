package br.com.digitalinnovationone.pureJava.strategyPattern;

public class ComportamentoAgressivo implements Comportamento{
    @Override
    public void mover() {
        System.out.println("Atacando");
    }
}
