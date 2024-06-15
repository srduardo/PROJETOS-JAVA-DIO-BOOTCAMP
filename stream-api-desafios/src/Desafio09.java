import java.util.Arrays;
import java.util.List;

public class Desafio09 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        boolean result = numeros.stream().distinct().count() == numeros.size();

        if (result) {
            System.out.println("Todos distintos");
        } else {
            System.out.println("Alguns iguais!");
        }
    }
}
