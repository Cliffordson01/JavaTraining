/*
 Autor: Cliffordson Cetoute
 RA: 168475-2024
  OBJETIVO: Criar uma Hierarquia de Produtos e Filtrar por Preço
  */
package App.Lista05Map.Exe01;

public abstract class ItemLoja implements Vendavel {
    private int id;
    private String nome;
    double preco;

    public ItemLoja (int id, String nome, double preco){
        this.id = id;
        this.nome = nome;
        this.preco = preco;

    }

    @Override
    public double getPreco(){
        return this.preco;
    }

    public int getId(){
        return this.id;
    }

    public String getNome(){
        return this.nome;
    }

}
