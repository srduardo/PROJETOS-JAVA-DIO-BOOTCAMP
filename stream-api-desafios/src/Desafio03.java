import java.util.Arrays;
import java.util.List;

public class Desafio03 {
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        numeros.stream().forEach(n -> {
            if (n > 0){
                System.out.println("Positivo");
            } else {
                System.out.println("Negativo");
            }
        });
    }
}
