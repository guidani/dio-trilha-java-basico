package br.com.digitalinnovationone.pureJava.strategyPattern;

public class Main {
    public static void main(String[] args) {

        ComportamentoAgressivo comportamentoAgressivo = new ComportamentoAgressivo();
        ComportamentoNormal comportamentoNormal = new ComportamentoNormal();
        ComportamentoDefensivo comportamentoDefensivo = new ComportamentoDefensivo();
        Robo robo  = new Robo();

        robo.setStrategy(comportamentoAgressivo);
        robo.mover();
        robo.mover();

        robo.setStrategy(comportamentoNormal);
        robo.mover();
        robo.mover();

        robo.setStrategy(comportamentoDefensivo);
        robo.mover();
        robo.mover();
    }
}
