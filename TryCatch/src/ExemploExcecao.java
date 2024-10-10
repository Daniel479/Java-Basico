public class ExemploExcecao {
    public static void main(String[] args) {
        try {
            int resultado = 10 / 0; // Isso vai causar uma ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Erro: Divisão por zero!");
        // finally faz que o Código que sempre seja executado, ocorrendo ou não exceção{
        } finally {   
            System.out.println("Bloco finally executado.");
        }
    }
}
