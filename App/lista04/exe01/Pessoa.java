/*
 Autor: Cliffordson Cetoute
 RA: 168475-2024
 OBJETIVO: Filtrar Clientes com Idade Acima de 30 Anos
  */
  
package App.lista04.exe01;

public abstract class Pessoa implements Entidade {
    private String nome;
    private int idade;

   
    public Pessoa(String nome, int idade ){
            this.nome = nome;
            this.idade = idade;
        }

        @Override
        public String getNome (){
            return this.nome;
        }

        public int getIdade(){
            return this.idade;
        }
}
