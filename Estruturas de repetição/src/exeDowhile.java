import java.util.Scanner;

public class exeDowhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        // Loop que continuará até o usuário digitar 'x'
        while (true) {
            System.out.print("Digite um número ou 'x' para sair: ");
      
            input = scanner.nextLine(); // Lê a entrada do usuário

            // Se o usuário digitar 'x', o loop será encerrado
            if (input.equalsIgnoreCase("x")) {
                System.out.println("Programa encerrado.");
                break;
            }

            try {
                int numeroInt = Integer.parseInt(input); // Tenta converter a String para int
                System.out.println("Número inteiro: " + numeroInt); // Exibe o número convertido
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida, por favor digite um número ou 'x' para sair."); // Mensagem de erro
            }
        }

        scanner.close(); // Fecha o scanner
    }
}
