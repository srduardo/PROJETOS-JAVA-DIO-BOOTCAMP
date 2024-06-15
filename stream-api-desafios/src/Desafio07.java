import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * distinct() : Remove os elementos iguais de um stream;
 * sorted((a, b) -> b - a) : Ordena os elementos de um stream ao contrário;
 * skip(1) : Pula o primeiro elemento de um stream;
 * findFirst() : Encontra o primeiro elemento depois do skip(1).
 */

public class Desafio07 {
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Optional<Integer> segundoMaior = numeros.stream().distinct().sorted((a, b) -> b - a).skip(1).findFirst();

        if (segundoMaior.isPresent()) {
            System.out.println(segundoMaior);
        } else {
            System.out.println("Nada encontrado!");
        }
    }
}
