import java.util.Arrays;
import java.util.List;
// import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        // Criando list de inteiros:
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        //Declarando function:
        // Function<Integer, Integer> numeroDobrados = numero -> numero * 2;

        // Aplicando lambda no map:
        // Map: Tranforma ou converte um elemento sem modificá-lo:
        List<Integer> dobro = numeros.stream().map(n -> n * 2).toList();

        //
        dobro.forEach(System.out::println);
    }
}
