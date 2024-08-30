public class App {
    public static void main(String[] args) throws Exception {
        No no1 = new No("Conteudo 1");
        No no2 = new No("Conteudo 2");
        No no3 = new No("Conteudo 3");

        no1.setProximoNo(no2);
        no2.setProximoNo(no3);

        No no4 = new No("conteudo 4");
        adicionaNo(no3, no4);
        imprimeValores(no1);
        System.out.println("---".repeat(50));
        apagaNoFim(no1);
        imprimeValores(no1);
        esvaziaLista(no1);
        imprimeValores(no1);

        // No com generics
        NoGeneric<String> ng1 = new NoGeneric<>("Olá");
        NoGeneric<String> ng2 = new NoGeneric<>("Mundo");
        NoGeneric<Integer> ng3 = new NoGeneric<>(1);
        NoGeneric<Double> ng4 = new NoGeneric<>(1.1);
        //
        ng1.setProximoNo(ng2);
        // Erro, pois o próximo Nó é do tipo String, o mesmo de ng2
        // ng2.setProximoNo(ng3);
        // Erro, pois o próximo Nó é do tipo Integer, o mesmo de ng3
        // ng3.setProximoNo(ng4);

    }

    static void imprimeValores(No no) {
        if (no == null) {
            System.out.println("LISTA VAZIA");
        }
        System.out.println(no.getConteudo().toString());
        if (no.getProximoNo() == null) {
            System.out.println("NULL");
            return;
        }
        imprimeValores(no.getProximoNo());
    }

    static void adicionaNo(No head, No novoNo) {
        if (head.getProximoNo() == null) {
            head.setProximoNo(novoNo);
            return;
        }
        adicionaNo(head.getProximoNo(), novoNo);
    }

    static void apagaNoFim(No head) {
        if (head.getProximoNo() == null) {
            return;
        }
        if (head.getProximoNo().getProximoNo() == null) {
            head.setProximoNo(null);
            return;
        } else {
            apagaNoFim(head.getProximoNo());
        }
    }

    static No esvaziaLista(No head) {
        while (head.getProximoNo() != null) {
            apagaNoFim(head);
        }
        return new No(null);
    }

}
