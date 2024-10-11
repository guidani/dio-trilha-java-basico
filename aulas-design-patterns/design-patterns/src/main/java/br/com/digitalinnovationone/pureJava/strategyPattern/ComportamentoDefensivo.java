package br.com.digitalinnovationone.pureJava.strategyPattern;

public class ComportamentoDefensivo implements Comportamento{
    @Override
    public void mover() {
        System.out.println("Recuando 1 casa");
    }
}
