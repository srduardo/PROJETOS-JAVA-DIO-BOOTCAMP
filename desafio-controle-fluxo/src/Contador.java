import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um número: ");
        int primeiroNumero = scanner.nextInt();

        System.out.println("Insira outro número: ");
        int segundonumero = scanner.nextInt();

        try {
            contador(primeiroNumero, segundonumero);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
        }

        scanner.close();
    }

    public static void contador(int primeiroNumero, int segundoNumero) throws ParametrosInvalidosException {

        if (primeiroNumero > segundoNumero) {
            throw new ParametrosInvalidosException();
        }

        int contagem = segundoNumero - primeiroNumero;

        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprime o número: " + i + ".");
        }

    }
}
