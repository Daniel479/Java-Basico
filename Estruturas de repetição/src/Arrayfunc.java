public class Arrayfunc { // Declaração da classe Arrayfunc
    public static void main(String[] args) { // Método principal onde a execução começa
        // Declaração e inicialização do array de Strings 'funcionarios' com 5 nomes
        String funcionarios [] = {"DANIEL", "MARCOS", "JOSE", "MARIA", "BIANCA"};

        // Início do laço 'for', que vai percorrer o array de funcionários
        for (int x=0; x < funcionarios.length; x++) {
            // A cada iteração, o índice 'x' e o respectivo nome do funcionário no array são exibidos
            System.out.println("O Funcionario no indice x= " + x + " é " + funcionarios[x]);
        }
    }
}
