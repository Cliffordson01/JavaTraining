/*
 Autor: Cliffordson Cetoute
 RA: 168475-2024
  OBJETIVO:  Mapear uma Lista de Objetos para um DTO
  */
package App.Lista05Map.Exe04;

public class Pedido {
    private int id;
    private String cliente;
    private double valorTotal;

    public Pedido(int id, String cliente, double valorTotal){
        this.id = id;
        this.cliente = cliente;
        this.valorTotal = valorTotal;
    }

    public int getId(){
        return this.id;
    }

    public String getCliente(){
        return this.cliente;
    }
    public double getValorTotal(){
        return this.valorTotal;
    }
}
