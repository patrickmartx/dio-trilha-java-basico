import java.util.Scanner;
/**
 * <h1>ContaTerminal</h1>
 * A ContaTerminal solicita dados do Usuário para exibir uma mensagem de agradecimento informando dados de sua conta bancária.
 * <p>
 * <b>Note:</b> Leia atentamente a documentação desta classe
 * para desfrutar dos recursos oferecidos pelo autor
 * 
 * @author Patrick Martins
 * @version 1.0
 * @since 25/08/2023
 */

public class ContaTerminal {
    /**
     * <h1>main</h1>
     * Método responsável pela execução do programa.
     * <p>
     * Sua principal função é exibir em terminal uma mensagem solicitando dados como:
     * <li>
     * <ul>Número da conta</ul>
     * <ul>Número da agência</ul>
     * <ul>Nome do cliente</ul>
     * <ul>Saldo na conta do cliente</ul>
     * </li>
     * 
     * @param args;
     * @throws Exception
     */
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

    /**
     * <h1>exibeMensagemBoasVindas</h1>
     * Método responsável por receber as informações solicitadas no método de execução e, com elas, gerar uma mensagem personalizada para o cliente.
     * 
     * @param numeroConta = int Número da conta do cliente.
     * @param numeroAgencia = String Número da agência do cliente
     * @param nomeCliente = String Nome do cliente
     * @param saldoNaConta = boolean Saldo na conta do cliente
     */
    public static void exibeMensagemBoasVindas(int numeroConta, String numeroAgencia, String nomeCliente, double saldoNaConta){
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %2f já está disponível para saque.", 
        nomeCliente, numeroAgencia, numeroConta, saldoNaConta);
    }
}
