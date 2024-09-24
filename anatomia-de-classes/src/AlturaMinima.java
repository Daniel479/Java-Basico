import java.util.Scanner; // Importa a classe Scanner para permitir a entrada de dados do usuário.
import java.util.Locale; // Importa a classe Locale para configurar o formato de entrada de dados.

public class AlturaMinima { // Declaração da classe pública AlturaMinima.
    public static void main(String[] args) { // Método principal onde a execução do programa começa.
        Scanner scanner = new Scanner(System.in); // Cria um novo objeto Scanner para ler a entrada do usuário.
        scanner.useLocale(Locale.US);  // Define o scanner para usar o formato de números com ponto decimal, adequado para os Estados Unidos.

        System.out.print("Insira a altura: "); // Exibe uma mensagem solicitando ao usuário que insira sua altura.
        
        if (scanner.hasNextDouble()) { // Verifica se a próxima entrada do usuário é um número decimal (double).
            double alturamin = scanner.nextDouble(); // Lê o número decimal fornecido pelo usuário e o armazena na variável alturamin.

            if (alturamin < 1.80) { // Verifica se a altura inserida é menor que 1.80 metros.
                System.out.println("altura aceitavel."); // Exibe uma mensagem se a altura for menor que 1.80 metros.
            } else { // Se a altura for igual ou maior que 1.80 metros.
                System.out.println(" altura incompativel."); // Exibe uma mensagem indicando que o usuário pode respirar agora.
            }
        } else { // Se a entrada do usuário não for um número decimal.
            System.out.println("Entrada inválida. Por favor, insira um número."); // Exibe uma mensagem de erro solicitando uma entrada válida.
        }
        
        scanner.close(); // Fecha o scanner para liberar os recursos.
    }
}
