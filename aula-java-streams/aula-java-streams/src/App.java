import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Gato
 */
public class App {
    public static void main(String[] args) throws Exception {

        List<Gato> meusGatos = new ArrayList<>() {
            {
                add(new Gato("Jon", 12, "preto"));
                add(new Gato("Simba", 6, "tigrado"));
                add(new Gato("Felix", 18, "amarelo"));
            }
        };

        // Exemplo de classe anônima
        // meusGatos.sort(new Comparator<Gato>() {
        // @Override
        // public int compare(Gato g1, Gato g2) {
        // return Integer.compare(g1.getIdade(), g2.getIdade());
        // }
        // });

        //Exemplo com função lambda
        meusGatos.sort(Comparator.comparing(
                (Gato g1) -> (g1.getIdade())));

        System.out.println(meusGatos.toString());
    }
}
