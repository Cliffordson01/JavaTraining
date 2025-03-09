package App.lista04.Exe05;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Funcionario extends Pessoa {
    private double salario;
    private String departamento;

    public Funcionario(String nome, int idade, double salario, String departamento){
        super(nome, idade);
        this.salario=salario;
        this.departamento=departamento;
    }

    public double getSalario(){
        return this.salario;
    }
    public String getDepartamento(){
        return this.departamento;
    }

    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new Funcionario("Mary", 24, 2000.00, "Financeiro"));
        funcionarios.add(new Funcionario("Junior", 25, 3000.00, "Juridico"));
        funcionarios.add(new Funcionario("Osmar", 26, 5000.00, "TI"));
        funcionarios.add(new Funcionario("Wells", 26, 10000.00, "Logistica"));
        funcionarios.add(new Funcionario("Carlos", 30, 15000.00, "Gerenciamento"));

        Map<String, List<Funcionario>>FaixaSalarial = funcionarios.stream()
        .filter(funcionario -> funcionario.getSalario()>=2000 && funcionario.getSalario()<= 5000)
        .collect(Collectors.groupingBy(Funcionario::getDepartamento));
       

        for (Map.Entry<String, List<Funcionario>> entry : FaixaSalarial.entrySet()) {
            String departamento = entry.getKey();
            List<Funcionario> funcionariosDoDepartamento = entry.getValue();

            System.out.println("Departamento: " + departamento);
            for (Funcionario funcionario : funcionariosDoDepartamento) {
                System.out.println("  Nome: " + funcionario.getNome() + 
                                 " | Salário: " + funcionario.getSalario());
            }
        }
    }
}
