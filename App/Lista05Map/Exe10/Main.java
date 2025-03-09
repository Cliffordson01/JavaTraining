package App.Lista05Map.Exe10;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
      public static void main(String[] args) {
        List<Vendedor> vendedores = new ArrayList<>();
        vendedores.add(new Vendedor("João", 12000.0));
        vendedores.add(new Vendedor("Maria", 8000.0));
        vendedores.add(new Vendedor("Pedro", 15000.0));

        // Filtrar vendedores com mais de R$ 10.000,00 em vendas
        List<Vendedor> vendedoresFiltrados = vendedores.stream()
            .filter(v -> v.getTotalVendas() > 10000)
            .collect(Collectors.toList());

        // Encontrar o maior e o menor total de vendas
        Optional<Vendedor> maiorVenda = vendedores.stream()
            .max(Comparator.comparing(Vendedor::getTotalVendas));

        Optional<Vendedor> menorVenda = vendedores.stream()
            .min(Comparator.comparing(Vendedor::getTotalVendas));

        // Lista de nomes dos vendedores
        List<String> nomesVendedores = vendedores.stream()
            .map(Vendedor::getNome)
            .collect(Collectors.toList());

        // Exibição dos resultados
        System.out.println("Vendedores com mais de R$ 10.000,00:");
        vendedoresFiltrados.forEach(v -> System.out.println(v.getNome() + " - R$ " + v.getTotalVendas()));

        maiorVenda.ifPresent(v -> System.out.println("Maior venda: " + v.getNome() + " - R$ " + v.getTotalVendas()));
        menorVenda.ifPresent(v -> System.out.println("Menor venda: " + v.getNome() + " - R$ " + v.getTotalVendas()));

        System.out.println("Nomes dos vendedores: " + nomesVendedores);
    }
}

