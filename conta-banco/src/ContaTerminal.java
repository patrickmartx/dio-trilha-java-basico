import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        int numeroConta;
        String numeroAgencia;
        String nomeCliente;
        double saldoNaConta;

        System.out.print("Por favor, digite o número da sua conta:\n> ");
        numeroConta = teclado.nextInt();

        teclado.nextLine(); // Descarregando buffer para ler valor String após ler um valor numérico

        System.out.print("Por favor, digite o número da sua agência:\n> ");
        numeroAgencia = teclado.nextLine();

        System.out.print("Por favor, insira seu nome e sobrenome:\n> ");
        nomeCliente = teclado.nextLine();

        System.out.print("Por favor, digite o seu saldo:\n> ");
        saldoNaConta = teclado.nextDouble();

        numeroAgencia = numeroAgencia.replaceAll("\\s+","");
        nomeCliente = nomeCliente.replaceAll("\\s+","");

        exibeMensagemBoasVindas(numeroConta, numeroAgencia, nomeCliente, saldoNaConta);

    }

    public static void exibeMensagemBoasVindas(int numeroConta, String numeroAgencia, String nomeCliente, double saldoNaConta){
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %2f já está disponível para saque.", 
        nomeCliente, numeroAgencia, numeroConta, saldoNaConta);
    }
}
