/*
 Autor: Cliffordson Cetoute
 RA: 168475-2024
  OBJETIVO: Filtrar Funcionários com Salário Maior que R$ 5000 e Ordenar
  */
  
package App.lista04.Exe02;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Funcionario extends Pessoa {

     private double salario;

     public Funcionario(String nome, int idade, double salario){
        super(nome, idade);
        this.salario = salario;
     }

     public double getSalario (){
        return this.salario;
     }

     public static void main(String[] args) {
        
        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new Funcionario("Kayli", 35, 5000.00));
        funcionarios.add(new Funcionario("Mary", 55, 6000.00));
        funcionarios.add(new Funcionario("Pryle", 20, 10000.00));
        funcionarios.add(new Funcionario("Jao", 19, 2000.00));
        funcionarios.add(new Funcionario("Arika", 18, 1500.00));
        funcionarios.add(new Funcionario("Mark", 18, 1000.00));
        funcionarios.add(new Funcionario("Jensen", 18, 15000.00));

        List<Funcionario>  SalarioMaior = funcionarios.stream()
        .filter(funcionario -> funcionario.getSalario()>=5000.00)
        .sorted(Comparator.comparing(Funcionario::getSalario).reversed())
        .collect(Collectors.toList());

        
        System.out.println("Funcionarios com salario maior que R$ 5000 (ordenados do maior para o menor):");

        for (Funcionario funcionario : SalarioMaior) {
            System.out.println("Funcionario: " + funcionario.getNome() + " | Salario: " + funcionario.getSalario());
        }

    }
    
}
