/*
 Autor: Cliffordson Cetoute
 RA: 168475-2024
  OBJETIVO:  Agrupamento de Funcionários por Cargo e Mapeamento para Médias
  */

package App.Lista05Map.Exe03;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Funcionario extends Pessoa {
    private String cargo;
    private double salario;

    public Funcionario(String nome, int idade, String cargo, double salario) {
        super(nome, idade);
        this.cargo = cargo;
        this.salario = salario;

    }

    public String getCargo() {
        return this.cargo;
    }

    public double getSalario() {
        return this.salario;
    }

    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new Funcionario("Wells", 25, "Logistica", 10000.00));
        funcionarios.add(new Funcionario("Carlos", 28, "Gerenciamento", 15000.00));
        funcionarios.add(new Funcionario("Junior", 30, "Finaceiro", 10000.00));
        funcionarios.add(new Funcionario("Mist", 32, "TI", 12000.00));
        funcionarios.add(new Funcionario("Got", 21, "Supervisor", 20000.00));
        funcionarios.add(new Funcionario("Gabriel", 27, "Operacional", 11000.00));

        // Agrupamento por cargo
        Map<String, List<Funcionario>> funcionariosPorCargo = funcionarios.stream()
                .collect(Collectors.groupingBy(Funcionario::getCargo));

        // Lista de nomes dos funcionários
        List<String> nomesFuncionarios = funcionarios.stream()
                .map(Funcionario::getNome)
                .collect(Collectors.toList());

        // Média salarial por cargo
        Map<String, Double> mediaSalarialPorCargo = funcionarios.stream()
                .collect(Collectors.groupingBy(Funcionario::getCargo,
                        Collectors.averagingDouble(Funcionario::getSalario)));

        System.out.println("\nFuncionários agrupados por cargo:");
        for (Map.Entry<String, List<Funcionario>> entry : funcionariosPorCargo.entrySet()) {
            String cargo = entry.getKey();
            List<Funcionario> funcionariosDoCargo = entry.getValue(); // Mudei o nome da variável aqui
            System.out.println("Cargo: " + cargo);
            for (Funcionario funcionario : funcionariosDoCargo) {
                System.out.println("  Nome: " + funcionario.getNome());
            }
        }

        System.out.println("\nMédia salarial por cargo:");
        for (Map.Entry<String, Double> entry : mediaSalarialPorCargo.entrySet()) {
            System.out.println("Cargo: " + entry.getKey() + " | Média Salarial: " + entry.getValue());
        }
    }
}