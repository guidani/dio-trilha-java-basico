package br.com.digitalinnovationone.pureJava.strategyPattern;

public class ComportamentoNormal implements Comportamento {

    @Override
    public void mover() {
        System.out.println("Avançando 1 casa");
    }
}
