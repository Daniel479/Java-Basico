import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para leitura de entrada

        // Solicita ao usuário que insira os dados
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        
        System.out.print("Digite o número de sua Agência: ");
        String agencia = scanner.nextLine(); // Agência como String

        System.out.print("Digite o número de sua conta: ");
        String numeroConta = scanner.nextLine(); // Número da conta como String

        double saldo = 1412; // Valor fixo de saldo para o exemplo
        
        // Exibe os dados informados pelo usuário
        System.out.println("Olá " + nome + ", sua Agência é: " + agencia + ", conta: " + numeroConta + " e saldo: R$" + saldo );
 
        scanner.close(); // Fecha o scanner
    }
}
