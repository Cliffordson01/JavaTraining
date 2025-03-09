package App.Lista05Map.Exe12;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
     public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new Funcionario("João", 5000.0, "TI"));
        funcionarios.add(new Funcionario("Maria", 6000.0, "RH"));
        funcionarios.add(new Funcionario("Pedro", 7000.0, "TI"));

        // Filtrar funcionários do departamento "TI" e aplicar aumento de 10%
        List<Funcionario> funcionariosTI = funcionarios.stream()
            .filter(f -> f.getDepartamento().equals("TI"))
            .map(f -> new Funcionario(f.getNome(), f.getSalario() * 1.1, f.getDepartamento()))
            .collect(Collectors.toList());

        // Criar um Map com o total dos salários por departamento
        Map<String, Double> totalSalariosPorDepartamento = funcionarios.stream()
            .collect(Collectors.groupingBy(Funcionario::getDepartamento,
                Collectors.summingDouble(Funcionario::getSalario)));

        // Exibição dos resultados
        System.out.println("Funcionários do TI com aumento de 10%:");
        funcionariosTI.forEach(f -> System.out.println(f.getNome() + " - R$ " + f.getSalario()));

        System.out.println("\nTotal de salários por departamento:");
        totalSalariosPorDepartamento.forEach((departamento, total) -> {
            System.out.println(departamento + ": R$ " + total);
        });
    }
}
