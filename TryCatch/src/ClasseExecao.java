// Definição de uma classe de exceção personalizada chamada 'MinhaExcecao'.
// Esta classe estende a classe 'Exception', o que a torna uma exceção verificada.
class MinhaExcecao extends Exception {

    // Construtor da classe 'MinhaExcecao', que recebe uma mensagem de erro como parâmetro.
    // O 'super(mensagem)' chama o construtor da classe pai ('Exception'),
    // que armazena a mensagem de erro para ser acessada posteriormente com o método 'getMessage()'.
    public MinhaExcecao(String mensagem) {
        super(mensagem);
    }
}

// Definição da classe 'ExemploExcecaoPersonalizada' que contém o método principal (main).
public class ClasseExecao {
    public static void main(String[] args) {

        // Bloco 'try' que tenta executar um código que pode lançar uma exceção.
        try {
            // Lançamento explícito da exceção personalizada 'MinhaExcecao' usando 'throw'.
            // A exceção é criada com a mensagem "Essa é uma exceção personalizada."
            throw new MinhaExcecao("Essa é uma exceção personalizada.");
        
        // Bloco 'catch' que captura a exceção do tipo 'MinhaExcecao' quando lançada.
        // A exceção capturada é armazenada na variável 'e'.
        } catch (MinhaExcecao e) {
            // Imprime no console a mensagem de erro associada à exceção,
            // que foi passada durante o lançamento da exceção.
            System.out.println(e.getMessage());
        }
    }
}
