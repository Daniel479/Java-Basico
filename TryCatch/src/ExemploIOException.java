import java.io.*;

public class ExemploIOException {
    public static void main(String[] args) {
        try {
            // Cria um FileReader para ler um arquivo
            FileReader file = new FileReader("exemplo.txt");
            // Cria um BufferedReader que usa o FileReader
            BufferedReader reader = new BufferedReader(file);
            
            String linha;
            // Lê o arquivo linha por linha
            while ((linha = reader.readLine()) != null) {
                System.out.println(linha);
            }
            
            // Fecha o BufferedReader
            reader.close();
        } catch (IOException e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
        }
    }
}
