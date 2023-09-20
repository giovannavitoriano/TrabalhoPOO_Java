package oo;

public class Carro extends Veículo{
    private int portas;

    public Carro(String marca, String modelo, int portas) {
        super(marca, modelo);
        this.portas = portas;
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    public void abrirPortas() {
        System.out.println(getMarca() + " " + getModelo() + " com " + portas + " portas abertas.");
    }

}
