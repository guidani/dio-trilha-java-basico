import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class ExercicioStream {

  public static void main(String[] args) {
    List<String> numerosAleatorios = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

    // Imprimir numeros
    numerosAleatorios.stream().forEach(new Consumer<String>() {
      @Override
      public void accept(String s) {
        System.out.println(s);

      }
    });

    System.out.println("-".repeat(50));

    // Adicionar em um Set;
    numerosAleatorios.stream().limit(5).collect(Collectors.toSet()).forEach(System.out::println);

    System.out.println("-".repeat(50));
    // Transformar strings em integers
    numerosAleatorios.stream()
        .map(Integer::parseInt)
        .collect(Collectors.toList())
        .forEach(System.out::println);

    System.out.println("-".repeat(50));

    // Pegar os numeros pares > 2 e add em uma lista
    numerosAleatorios.stream()
        .map(Integer::parseInt)
        .filter(i -> i % 2 == 0 && i > 2)
        .collect(Collectors.toList())
        .forEach(System.out::println);

    System.out.println("-".repeat(50));

    // Mostrar a media dos números;
    System.out.println("MEDIA");
    numerosAleatorios.stream()
        .mapToInt(Integer::parseInt)
        .average()
        .ifPresent(System.out::println);

    System.out.println("-".repeat(50));
    System.out.println("Remover Impares");

    // Remover valores impares
    List<Integer> numerosInteger = numerosAleatorios.stream().map(Integer::parseInt).collect(Collectors.toList());
    numerosInteger.removeIf(i -> i % 2 != 0);

    System.out.println(numerosInteger);

    System.out.println("-".repeat(50));
  }

}
