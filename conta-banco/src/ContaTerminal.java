import java.util.Scanner;

public class ContaTerminal {
    
    /** 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o número da conta:");
        int numero = scanner.nextInt();

        System.out.println("Informe a agência:");
        String agencia = scanner.next();

        System.out.println("Informe o seu nome:");
        String nomeCliente = scanner.next();

        System.out.println("Informe o saldo da conta:");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta no nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
        scanner.close();
    }
}
