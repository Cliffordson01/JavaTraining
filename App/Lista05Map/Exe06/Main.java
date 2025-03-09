package App.Lista05Map.Exe06;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("Wells", 25));
        clientes.add(new Cliente("Carlos", 27));
        clientes.add(new Cliente("Osmar", 30));
        clientes.add(new Cliente("Ghabriel", 40));
        clientes.add(new Cliente("Mist", 35));
        clientes.add(new Cliente("Got", 22));
        clientes.add(new Cliente("KAYLI", 30));
        clientes.add(new Cliente("Keyli", 40));


              // Filtragem de clientes maiores de 18 anos
              List<Cliente> clientesMaioresDe18 = clientes.stream()
              .filter(cliente -> cliente.getIdade() > 18) // Filtra clientes maiores de 18 anos
              .collect(Collectors.toList()); // Coleta os resultados em uma lista

      // Contagem de clientes com mais de 30 anos
      long clientesMaisDe30 = clientes.stream()
              .filter(cliente -> cliente.getIdade() > 30) // Filtra clientes com mais de 30 anos
              .count(); // Conta quantos clientes atendem ao critério

      // Transformação para lista de nomes
      List<String> nomesClientes = clientes.stream()
              .map(Cliente::getNome) // Transforma a lista de clientes em uma lista de nomes
              .collect(Collectors.toList()); // Coleta os resultados em uma lista

      // Exibição dos resultados
      System.out.println("Clientes maiores de 18 anos:");
      for (Cliente cliente : clientesMaioresDe18) {
          System.out.println("Nome: " + cliente.getNome() + " | Idade: " + cliente.getIdade());
      }

      System.out.println("\nQuantidade de clientes com mais de 30 anos: " + clientesMaisDe30);

      System.out.println("\nNomes dos clientes:");
      for (String nome : nomesClientes) {
          System.out.println(nome);
      }
  }
}
