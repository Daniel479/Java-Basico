public class TryandCatch {
    public static void main(String[] args) {
        // Declarando um array com três elementos
        int[] numeros = {1, 2, 3};

        try {
            // Tentando acessar um índice fora dos limites do array
            System.out.println("O quarto número é: " + numeros[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Capturando a exceção de acesso a índice inválido e exibindo uma mensagem
            System.out.println("Erro: Tentativa de acessar índice fora do limite do array!");
        }

        System.out.println("O programa continua executando normalmente.");
    }
}
