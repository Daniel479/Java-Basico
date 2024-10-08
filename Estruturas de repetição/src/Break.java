public class Break{
    public static void main(String[] args) {
        for (int numero = 1; numero <= 30; numero++) {
            if (numero == 20) {
                break; // Para a iteração quando o número for 20
            }
            System.out.println(numero); // Exibe o número se não for 3
        }
    }
}

