import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class JavaNIO {
    public static void main(String[] args) {

        try {

            // ainda não falamos de arrays e coleções
            // é só para ilustrar a escrita de várias linhas em um arquivo
            List<String> contatos = new ArrayList<>();
            contatos.add("(83) 2148-5886 Joemia Giron Lyrio Monnerat");
            contatos.add("(21) 2705-6726 Reginaldo Folly Barboza Brito");
            contatos.add("(91) 2416-8455 Mariza Gadelha Bastida Carneiro");
            contatos.add("(68) 3259-8389 Mirian Venancio Portela Ignacia");

            // arquivo de destino
            Path arquivoDestino = Paths.get("C:\\arquivos\\lista-contatos.txt");

            for(String linhaContato:contatos){
                String conteudo = linhaContato + System.lineSeparator();
                Files.write(arquivoDestino, conteudo.getBytes(StandardCharsets.UTF_8), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }



}

