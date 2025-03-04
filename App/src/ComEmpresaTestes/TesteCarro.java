package ComEmpresaTestes;
import ComEmpresaVeiculos.Carro;

import ComEmpresaVeiculos.Carro;

public class TesteCarro {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.modelo = "Ferrari";
        carro.ano = 2023;
        System.out.println("O modelo e " + carro.modelo + " O ano e " + carro.ano);

    }
}
