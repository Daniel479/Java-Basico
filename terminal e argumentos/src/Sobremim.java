import java.util.Scanner;

public class Sobremim {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para leitura de entrada

        // Solicita ao usuário que insira os dados
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        
        System.out.print("Digite seu sobrenome: ");
        String sobrenome = scanner.nextLine();
        
        System.out.print("Digite sua idade: ");
        int idade;
        while (true) {
            try {
                idade = Integer.valueOf(scanner.nextLine()); // Lê a idade como string e converte para inteiro
                break; // Sai do loop se a conversão for bem-sucedida
            } catch (NumberFormatException e) {
                System.out.print("Por favor, insira uma idade válida: ");
            }
        }
        
        System.out.print("Digite sua altura em cm: ");
        double altura;
        while (true) {
            try {
                altura = Double.valueOf(scanner.nextLine()); // Lê a altura como string e converte para double
                break; // Sai do loop se a conversão for bem-sucedida
            } catch (NumberFormatException e) {
                System.out.print("Por favor, insira uma altura válida: ");
            }
        }

        // Exibe os dados informados pelo usuário
        System.out.println("Olá, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha altura é " + altura + " cm");

        scanner.close(); // Fecha o scanner
    }
}
