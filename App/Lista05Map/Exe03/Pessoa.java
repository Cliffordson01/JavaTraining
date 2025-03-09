/*
 Autor: Cliffordson Cetoute
 RA: 168475-2024
  OBJETIVO:  Agrupamento de Funcionários por Cargo e Mapeamento para Médias
  */
  
package App.Lista05Map.Exe03;

public abstract class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }
}
