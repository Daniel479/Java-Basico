public class Switch {
    public static void main(String[] args) {
        // Declaração da variável "sigla" e inicialização com o valor "A"
        String sigla = "A";
        
        // Início da estrutura switch, que avalia o valor da variável "sigla"
        switch (sigla) {
            // Caso o valor da variável seja "P", imprime "PEQUENO"
            case "P": {
                System.out.println("PEQUENO");
                // O break evita que os próximos casos sejam executados
                break;
            }
            // Caso o valor da variável seja "M", imprime "MEDIO"
            case "M": {
                System.out.println("MEDIO");
                break;
            }
            // Caso o valor da variável seja "G", imprime "GRANDE"
            case "G": {
                System.out.println("GRANDE");
                break;
            }
            // Caso a variável "sigla" não corresponda a nenhum dos casos anteriores
            default: {
                // Imprime "INDEFINIDO" se "sigla" não for "P", "M" ou "G"
                System.out.println("INDEFINIDO");
            }
        }
    }
}
