package Construct;

public class Pessoa {
    String nome;
    int idade; 
    public Pessoa (String nome, int idade){
        this.nome=nome;
        this.idade=idade;
    }

    public void apresentar(){
        System.out.println("O meu nome e " + nome + "e eu tenho " + idade + " anos");
    }
}
