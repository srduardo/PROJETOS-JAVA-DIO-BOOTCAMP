package Repetição;

import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0;
        
        while (mesada > 0) {
            Double valorDoce = valorAleatório();

            System.out.println("Doce do valor: " + valorDoce + " Adicionado ao carrinho.");
            mesada = mesada - valorDoce;
        }
        
    }

    private static double valorAleatório(){
        return ThreadLocalRandom.current().nextDouble(2,8);
    }
}
