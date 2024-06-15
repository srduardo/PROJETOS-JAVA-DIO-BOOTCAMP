import java.util.Arrays;
import java.util.List;
import java.util.Optional;

// reduce((n1, n2) -> n1 + n2) : Reduz dois elementos em um só ao realizar uma operação.

public class Desafio08 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        Optional<Integer> soma = numeros.stream().reduce((n1, n2) -> n1 + n2);

        System.out.println(soma);
    }
}
