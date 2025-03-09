package App.Lista05Map.Exe11;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Pedido> pedidos = new ArrayList<>();
        pedidos.add(new Pedido(1, "João", "Pago"));
        pedidos.add(new Pedido(2, "Maria", "Pendente"));
        pedidos.add(new Pedido(3, "Pedro", "Pago"));
        pedidos.add(new Pedido(4, "Ana", "Cancelado"));

        // Filtrar pedidos com status "Pago"
        List<Pedido> pedidosPagos = pedidos.stream()
            .filter(p -> p.getStatus().equals("Pago"))
            .collect(Collectors.toList());

        // Agrupar pedidos por status
        Map<String, List<Pedido>> pedidosPorStatus = pedidos.stream()
            .collect(Collectors.groupingBy(Pedido::getStatus));

        // Exibição dos resultados
        System.out.println("Pedidos pagos:");
        pedidosPagos.forEach(p -> System.out.println("ID: " + p.getId() + " | Cliente: " + p.getCliente()));

        System.out.println("\nPedidos agrupados por status:");
        pedidosPorStatus.forEach((status, lista) -> {
            System.out.println("Status: " + status);
            lista.forEach(p -> System.out.println("  ID: " + p.getId() + " | Cliente: " + p.getCliente()));
        });
    }
}

