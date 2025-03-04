package Bank;

public class ContaBancaria {
    private double saldo;
    private String titular;

    public double getsaldo(){
        return saldo=1500;
    }
    public void settitular(String titular){
        this.titular=titular;
    }

    public void Salario(){
       System.out.println("O saldo e de " + saldo +  " o titular e " + titular);
    }
}
