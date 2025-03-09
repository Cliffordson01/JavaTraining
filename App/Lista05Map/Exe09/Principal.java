package App.Lista05Map.Exe09;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Principal {
     public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto(1, "Notebook", 3500.0));
        produtos.add(new Produto(2, "Smartphone", 1500.0));
        produtos.add(new Produto(3, "Tablet", 2000.0));

        // Converter lista para Map
        Map<Integer, Produto> mapaProdutos = produtos.stream()
            .collect(Collectors.toMap(Produto::getId, p -> p));

        // Exibir o Map
        mapaProdutos.forEach((id, produto) -> {
            System.out.println("ID: " + id + " | Nome: " + produto.getNome() + " | Preço: R$ " + produto.getPreco());
        });
    }
}

