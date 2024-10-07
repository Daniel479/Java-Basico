public class Condicoes {
    // Declaração da classe pública chamada Condicoes.
    // Em Java, o nome da classe deve ser o mesmo nome do arquivo.
    
    public static void main(String[] args) {
        // Método principal que o Java chama ao executar o programa.
        // 'public' significa que pode ser acessado de qualquer lugar.
        // 'static' permite que o método seja chamado sem instanciar a classe.
        // 'void' indica que o método não retorna valor.
        // 'String[] args' é um array de Strings que pode receber argumentos passados via linha de comando.
        
        int nota = 6;
        // Declaração de uma variável inteira chamada 'nota', que recebe o valor 6.
        // Essa variável será usada para avaliar as condições de aprovação, recuperação ou reprovação.
        
        String resultado = nota >= 7 ? "Aprovado" 
                         : nota >= 5 && nota < 7 ? "Recuperação" 
                         : "Reprovado";
        // Declaração de uma variável do tipo String chamada 'resultado'.
        // A variável recebe o valor com base em uma expressão ternária (uma forma compacta de usar if-else).
        // Primeira condição: se 'nota' for maior ou igual a 7, 'resultado' será "Aprovado".
        // Segunda condição: se 'nota' for maior ou igual a 5 e menor que 7, 'resultado' será "Recuperação".
        // Se nenhuma das condições anteriores for satisfeita, 'resultado' será "Reprovado".
        
        System.out.println(resultado);
        // Exibe o valor da variável 'resultado' no console, ou seja, imprime se o aluno foi aprovado, está em recuperação ou foi reprovado.
    }
}
