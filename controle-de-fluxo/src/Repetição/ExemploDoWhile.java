package Repetição;

import java.util.Random;

public class ExemploDoWhile {
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Discando...");

        do {
            System.out.println("Telefone tocando.");
        } while (tocando());

        System.out.println("Alô!");
    }

    public static boolean tocando(){
        boolean atendeu = new Random().nextInt(3) == 1;

        System.out.println("Atendeu? " + atendeu);

        return ! atendeu;
    }
}
