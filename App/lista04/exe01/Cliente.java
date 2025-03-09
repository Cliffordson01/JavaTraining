/*
 Autor: Cliffordson Cetoute
 RA: 168475-2024
 OBJETIVO: Filtrar Clientes com Idade Acima de 30 Anos
  */
  
package App.lista04.exe01;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;



public class Cliente extends Pessoa {
    public Cliente(String nome, int idade){
        super(nome, idade);
    }
    public static void main(String[] args) {

       List<Cliente>clientes = new ArrayList<>();

        clientes.add( new Cliente ("Mary", 25));
        clientes.add( new Cliente ("Kayli", 36));
        clientes.add( new Cliente ("Darina", 35));
        clientes.add( new Cliente ("Marcy", 30));
       
       List<Cliente> IdadeSuperior = clientes.stream()
       .filter(cliente -> cliente.getIdade()>=30)
       .collect(Collectors.toList());
       for (Cliente cliente : IdadeSuperior) {
            System.out.println(cliente.getNome());
       }
      
    }
}
