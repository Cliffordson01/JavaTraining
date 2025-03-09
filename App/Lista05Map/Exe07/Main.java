package App.Lista05Map.Exe07;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Notebook", 3500.0));
        produtos.add(new Produto("Smartphone", 1500.0));
        produtos.add(new Produto("Tablet", 2000.0));
        produtos.add(new Produto("Monitor", 800.0));

        // Encontrar o produto mais caro
        Optional<Produto> produtoMaisCaro = produtos.stream()
            .max(Comparator.comparing(Produto::getPreco));

        // Encontrar o produto mais barato
        Optional<Produto> produtoMaisBarato = produtos.stream()
            .min(Comparator.comparing(Produto::getPreco));

        // Lista de nomes dos produtos
        List<String> nomesProdutos = produtos.stream()
            .map(Produto::getNome)
            .collect(Collectors.toList());

        // Exibição dos resultados
        produtoMaisCaro.ifPresent(p -> System.out.println("Produto mais caro: " + p.getNome() + " - R$ " + p.getPreco()));
        produtoMaisBarato.ifPresent(p -> System.out.println("Produto mais barato: " + p.getNome() + " - R$ " + p.getPreco()));
        System.out.println("Nomes dos produtos: " + nomesProdutos);
    }
}