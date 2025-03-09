package App.Lista05Map.Exe13;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
     public static void main(String[] args) {
        List<Livro> livros = new ArrayList<>();
        livros.add(new Livro("Livro A", "Autor X", 50.0));
        livros.add(new Livro("Livro B", "Autor Y", 30.0));
        livros.add(new Livro("Livro C", "Autor X", 40.0));

        // Ordenar por preço (crescente) e autor (alfabético)
        List<Livro> livrosOrdenados = livros.stream()
            .sorted(Comparator.comparing(Livro::getPreco).thenComparing(Livro::getAutor))
            .collect(Collectors.toList());

        // Lista de títulos
        List<String> titulos = livrosOrdenados.stream()
            .map(Livro::getTitulo)
            .collect(Collectors.toList());

        // Concatenar títulos em uma única string
        String titulosConcatenados = livrosOrdenados.stream()
            .map(Livro::getTitulo)
            .collect(Collectors.joining(" | "));

        // Exibição dos resultados
        System.out.println("Livros ordenados:");
        livrosOrdenados.forEach(l -> System.out.println(l.getTitulo() + " - " + l.getAutor() + " - R$ " + l.getPreco()));

        System.out.println("\nTítulos dos livros: " + titulos);
        System.out.println("Títulos concatenados: " + titulosConcatenados);
    }
}

