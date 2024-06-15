import java.util.HashMap;
import java.util.Map;

public class GenericExemploMap {
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        // Exemplo sem Generics:
        Map<Object, Object> mapSemGenerics = new HashMap<>(); // Ou Map mapSemGenerics = new HashMap();
        mapSemGenerics.put("Chave 1", 10);
        mapSemGenerics.put("Chave 1", "Valor");

        // Exemplo com Generics:
        Map<String, Integer> mapGenerics = new HashMap<>();
        mapGenerics.put("Chave 1", 10);
        mapGenerics.put("Chave 2", 20);

        for (Map.Entry<String, Integer> entry : mapGenerics.entrySet()){
            String chave = entry.getKey();
            int valor = entry.getValue();
            System.out.println("Chave: " + chave + " Valor: " + valor);
        }

        for (Object obj : mapSemGenerics.entrySet()){
            @SuppressWarnings("rawtypes")
            Map.Entry entry = (Map.Entry) obj;
            String chave = (String) entry.getKey();
            Object valor = entry.getValue();
            System.out.println("Chave: " + chave + " Valor: " + valor);
        }
    }
}
