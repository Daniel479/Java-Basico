public class ExemploThrow {
    public static void main(String[] args) {
        try {
            validaIdade(15);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void validaIdade(int idade) {
        if (idade < 18) {
            throw new IllegalArgumentException("Idade menor que 18 anos não é permitida.");
        }
    }
}
