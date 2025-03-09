/*
 Autor: Cliffordson Cetoute
 RA: 168475-2024
  OBJETIVO:  Ordenação de Objetos (ASC e DESC) e Transformação de Lista
  */
package App.Lista05Map.Exe02;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Aluno> alunos = new ArrayList<>();
        alunos.add(new Aluno("Pedro", 8.0, 18));
        alunos.add(new Aluno("Luiza", 9.0, 20));
        alunos.add(new Aluno("Mary", 10, 20));
        alunos.add(new Aluno("Jao", 5, 21));
        alunos.add(new Aluno("Kaido", 4, 25));
        alunos.add(new Aluno("Karin", 6, 19));

        List<String> OrdenarAluno = alunos.stream()
        .filter(aluno -> aluno.getNota()>=7)
        .sorted(Comparator.comparing(Aluno::getNota).reversed().thenComparing(Aluno::getIdade))
        .map(Aluno::getNome)
        .collect(Collectors.toList());

        System.out.println("Alunos aprovados (ordenados por nota decrescente e idade crescente):");
        for (String nome : OrdenarAluno) {
            System.out.println(nome);
        }
    }
}
