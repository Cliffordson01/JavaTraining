package App.Lista05Map.Exe05;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();
    produtos.add(new Produto("CellPHONE", 5000.00));
    produtos.add(new Produto("Placa de video", 10000.00));
    produtos.add(new Produto("Headset", 2000.00));
    produtos.add(new Produto("Keyboard", 1000.00));

    List<Double> precos = produtos.stream()
    .map(Produto::getPreco) // Extrai os preços
    .collect(Collectors.toList()); // Coleta os preços em uma lista


    // Soma dos preços
        double somaPrecos = produtos.stream()
                .collect(Collectors.summingDouble(Produto::getPreco)); // Soma os preços

                // Média dos preços
                double mediaPrecos = produtos.stream()
                .collect(Collectors.averagingDouble(Produto::getPreco)); 

     // Exibição dos resultados
        System.out.println("Preços dos produtos: " + precos);
        System.out.println("Soma dos preços: " + somaPrecos);
        System.out.println("Média dos preços: " + mediaPrecos);
     
    }
}
