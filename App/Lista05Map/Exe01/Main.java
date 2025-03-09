/*
 Autor: Cliffordson Cetoute
 RA: 168475-2024
  OBJETIVO: Criar uma Hierarquia de Produtos e Filtrar por Preço
  */
  
package App.Lista05Map.Exe01;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<ItemLoja> produtos = new ArrayList<>();
        produtos.add(new Eletronico(1, "Headset", 300.00));
        produtos.add(new Eletronico(2, "Monitor", 2500.00));
        produtos.add(new Eletronico(3, "Keyboard", 500.00));
        produtos.add(new Eletronico(4, "Mouse", 250.00));
        produtos.add(new Eletronico(5, "Laptop", 10000.00));

        produtos.add(new Roupas(6, "Camisa", 1000.00));
        produtos.add(new Roupas(7, "Calca", 3000.00));
        produtos.add(new Roupas(8, "Bermuda", 500.00));
        produtos.add(new Roupas(6, "Camisa", 1000.00));
        produtos.add(new Roupas(9, "Terno", 10000.00));
        produtos.add(new Roupas(10, "Regata", 200.00));
 

        List<String> nomesProdutosCaros = produtos.stream()
                .filter(produto -> produto.getPreco() > 100) 
                .map(ItemLoja::getNome) 
                .collect(Collectors.toList()); 

       
        System.out.println("Produtos com preço acima de R$ 100,00:");
        for (String nome : nomesProdutosCaros) {
            System.out.println(nome);
        }
    }
}
