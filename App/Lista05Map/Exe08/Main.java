package App.Lista05Map.Exe08;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("João", 25));
        pessoas.add(new Pessoa("Maria", 30));
        pessoas.add(new Pessoa("Pedro", 40));

        // Lista de descrições
        List<String> descricoes = pessoas.stream()
            .map(Pessoa::getDescricao)
            .collect(Collectors.toList());

        // Concatenar descrições
        String descricoesConcatenadas = pessoas.stream()
            .map(Pessoa::getDescricao)
            .collect(Collectors.joining(", "));

        System.out.println("Descrições: " + descricoes);
        System.out.println("Descrições concatenadas: " + descricoesConcatenadas);
    }
}