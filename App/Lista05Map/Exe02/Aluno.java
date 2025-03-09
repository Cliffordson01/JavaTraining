/*
 Autor: Cliffordson Cetoute
 RA: 168475-2024
  OBJETIVO:  Ordenação de Objetos (ASC e DESC) e Transformação de Lista
  */
  
package App.Lista05Map.Exe02;

public class Aluno {
    private String nome;
    private double nota;
    private int idade;

    public Aluno(String nome, double nota, int idade){
        this.nome = nome;
        this.nota =nota;
        this.idade = idade;
    }

    public String getNome(){
        return this.nome;
    }
    public double getNota(){
        return this.nota;
    }
    public int getIdade(){
        return this.idade;
    }
}
