import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);

        // Declarando o Consumer:
        Consumer<Integer> consumerInteger = numero -> {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        };
        
        // ForEach: Basicamente percorre por cada elemento de uma collection e aplica uma funcitonal interface
        numeros.stream().forEach(consumerInteger);

        // Fazendo direto com Lambda:
        numeros.stream().forEach(numero -> {
            if (numero % 2 == 0){
                System.out.println(numero);
            }
        });
    }
}
