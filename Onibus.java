package oo;

public class Onibus extends  Veículo{

    private int capacidadePassageiros;
    public Onibus(String marca, String modelo, int capacidadePassageiros) {
        super(marca, modelo);
        this.capacidadePassageiros = capacidadePassageiros;
    }

    public int getCapacidadePassageiros() {
        return capacidadePassageiros;
    }

    public void setCapacidadePassageiros(int capacidadePassageiros) {
        this.capacidadePassageiros = capacidadePassageiros;
    }

    public void receberPassageiros(){
        System.out.println(getMarca() + " " + getModelo() + " carregado com " + capacidadePassageiros + " passageiros");
    }
}
