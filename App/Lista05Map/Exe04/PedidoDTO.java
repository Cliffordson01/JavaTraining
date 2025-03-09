/*
 Autor: Cliffordson Cetoute
 RA: 168475-2024
  OBJETIVO:  Mapear uma Lista de Objetos para um DTO
  */
package App.Lista05Map.Exe04;

public class PedidoDTO {
    private int id;
    private double valorTotal;

    public PedidoDTO(int id, double valorTotal) {
        this.id = id;
        this.valorTotal = valorTotal;
    }

    public int getId() {
        return this.id;
    }

    public double getValorTotal() {
        return this.valorTotal;
    }

    @Override
    public String toString() {
        return "PedidoDTO [id=" + id + ", valorTotal=" + valorTotal + "]";
    }
}