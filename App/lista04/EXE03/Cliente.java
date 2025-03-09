/*
 Autor: Cliffordson Cetoute
 RA: 168475-2024
  OBJETIVO: Filtrar Clientes com Mais de 5 Anos de Cadastro
  */
package App.lista04.EXE03;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Cliente extends Pessoa {
    private LocalDate dataCadastro;

    public Cliente (String nome, int idade, LocalDate dataCadastro){
        super(nome, idade);
        this.dataCadastro =dataCadastro;
    }

    public LocalDate getDataCadastro(){
        return this.dataCadastro;
    }
    public int getTempoCadastro(){
          LocalDate hoje = LocalDate.now();
        return Period.between(dataCadastro, hoje).getYears();
    }

    public static void main(String[] args) {
        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("Keyla", 35,  LocalDate.parse("2015-02-20")));
        clientes.add(new Cliente("Kezia", 26,  LocalDate.parse("2010-02-27")));
        clientes.add(new Cliente("Kayla", 37,  LocalDate.parse("2016-03-01")));
        clientes.add(new Cliente("Klivar", 33, LocalDate.parse("2018-03-02")));
        clientes.add(new Cliente("Kernay", 44, LocalDate.parse("2025-03-04")));
        
        List<Cliente> TempoMaior = clientes.stream()
        .filter(cliente -> cliente.getTempoCadastro()>5)
        .sorted(Comparator.comparing(Cliente:: getTempoCadastro).reversed())
        .collect(Collectors.toList());

        System.out.println("Clientes com Mais de 5 Anos de Cadastro sao: ");
        for (Cliente cliente : TempoMaior) {
            System.out.println("Nome do cliente: "+ cliente.getNome() + " | Idade "+ cliente.getIdade() + " Anos " + " | Tempo de cadastro " + cliente.getTempoCadastro() + " Anos");

        }
    }
    
}
