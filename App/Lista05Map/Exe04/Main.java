/*
 Autor: Cliffordson Cetoute
 RA: 168475-2024
  OBJETIVO:  Mapear uma Lista de Objetos para um DTO
  */
package App.Lista05Map.Exe04;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
      public static void main(String[] args) {
        // Criação da lista de Pedidos
        List<Pedido> pedidos = new ArrayList<>();
        pedidos.add(new Pedido(1, "MARY", 500));
        pedidos.add(new Pedido(2, "WELL", 800));
        pedidos.add(new Pedido(3, "LYKLA", 1000));
        pedidos.add(new Pedido(4, "KAYLA", 900));

        // Transformação de Pedido para PedidoDTO
        List<PedidoDTO> pedidoDTOs = pedidos.stream()
                .map(p -> new PedidoDTO(p.getId(), p.getValorTotal())) // Mapeia para PedidoDTO
                .collect(Collectors.toList()); // Coleta os resultados em uma lista

        // Exibição dos resultados
        System.out.println("Pedidos transformados em DTOs:");
        for (PedidoDTO pedidoDTO : pedidoDTOs) {
            System.out.println(pedidoDTO);
        }
    }
}
