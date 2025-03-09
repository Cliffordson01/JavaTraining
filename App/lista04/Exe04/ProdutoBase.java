/*
 Autor: Cliffordson Cetoute
 RA: 168475-2024
  OBJETIVO:  Filtrar e Ordenar Produtos pelo Preço
  */
  
package App.lista04.Exe04;

public abstract class ProdutoBase implements Entidade {
   private String nome;
    private int qtdEmEstoque;

    public ProdutoBase(String nome, int qtdEmEstoque){
        this.nome = nome;
        this.qtdEmEstoque = qtdEmEstoque;
    }

    @Override
    public String getNome(){
        return this.nome;
    }
    public int getQtdEmEstoque(){
        return this.qtdEmEstoque;
    }
    
}
