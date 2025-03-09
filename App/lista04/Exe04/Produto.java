/*
 Autor: Cliffordson Cetoute
 RA: 168475-2024
  OBJETIVO:  Filtrar e Ordenar Produtos pelo Preço
  */
  
package App.lista04.Exe04;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Produto extends ProdutoBase {
    private double preco;
    public Produto (String nome, int qtdEmEstoque, double preco){
        super(nome, qtdEmEstoque);
        this.preco = preco;
    }

    public double getPreco (){
        return this.preco;
    }

    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Tenis", 15, 5000.00));
        produtos.add(new Produto("Boné", 10, 500.00));
        produtos.add(new Produto("Bracelet", 7, 1000.00));
        produtos.add(new Produto("Correntes", 15, 10000.00));

        List<Produto> produtoEmEstoque = produtos.stream()
        .filter(produto -> produto.getQtdEmEstoque()>0)
        .sorted(Comparator.comparing(Produto::getPreco).reversed().thenComparing(Produto::getQtdEmEstoque))
        .collect(Collectors.toList());

        for (Produto produto : produtoEmEstoque) {
            System.out.println("Nome do produto: " + produto.getNome() + " Quatidade em estoque: " + produto.getQtdEmEstoque() + " Preço: " + produto.getPreco());
        }
    }


}
