import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Questionario {
  public static void main(String[] args) {
    Set<String> cores = new TreeSet<>(Arrays.asList("verde", "amarelo", "azul", "branco"));
    System.out.println(cores.toString());
  }
}
