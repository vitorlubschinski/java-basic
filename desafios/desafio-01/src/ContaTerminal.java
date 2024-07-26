import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);

       System.out.println("Insira o numero da Conta:");
       int numero = scanner.nextInt();

       System.out.println("Insira o numero da Agencia:");
       String agencia = scanner.next();

       System.out.println("Insira o seu nome:");
       String nomeCliente = scanner.next();

       System.out.println("Insira o saldo da conta:");
       Double saldo = scanner.nextDouble();


        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é: %s, conta: %s e seu saldo R$ %.2f já está disponível para saque.%n",
        nomeCliente, agencia, numero, saldo);
    }
}
