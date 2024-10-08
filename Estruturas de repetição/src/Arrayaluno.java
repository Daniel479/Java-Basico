public class Arrayaluno { // Declaração da classe Arrayaluno
    public static void main(String[] args) { // Método principal onde o programa começa a executar
     
        // Declaração e inicialização do array de Strings 'alunos'
        String alunos[] = {"ALINE", "BIANCA", "MARIA", "JESSICA"};

        // Loop 'for-each' que percorre cada elemento do array 'alunos'
        for(String aluno : alunos) {
            // Exibe o nome do aluno atual no loop
            System.out.println("Nomes dos alunos: " + aluno);
        }
    }
}
