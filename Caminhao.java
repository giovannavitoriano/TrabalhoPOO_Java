package oo;

public class Caminhao extends Veículo{
    private String carga;
    private int capacidadeCarga;

    public Caminhao(String marca, String modelo, String carga, int capacidadeCarga) {
        super(marca, modelo);
        this.carga = carga;
        this.capacidadeCarga = capacidadeCarga;
    }

    public String getCarga() {
        return carga;
    }

    public void setCarga(String carga) {
        this.carga = carga;
    }

    public int getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(int capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    public void carregar() {
        System.out.println(getMarca() + " " + getModelo() + " carregado com " + carga + " sendo "  + capacidadeCarga + " toneladas.");
    }
}