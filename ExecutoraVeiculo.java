package oo;

import java.util.Scanner;

public class ExecutoraVeiculo {

    public static void finalizarMenu() {
        System.out.println("finalizando");

    }

    public static void main(String[] args) {
        Veículo carro = new Carro("fiat", "uno", 4);
        Veículo onibus = new Onibus("Iveco", "Micro", 30);
        Veículo caminhao = new Caminhao("scania", "R540", "soja", 5);

        int op;
        Scanner leitura = new Scanner(System.in);

        do {
            System.out.println("Escolha uma operação:");
            System.out.println("0 - Sair do menu.");
            System.out.println("1 - Listar Veículos.");
            System.out.println("2 - Abrir carro.");
            System.out.println("3 - Receber passageiros.");
            System.out.println("4 - Receber carga.");
            op = leitura.nextInt();

            if (op < 0 || op > 4) {
                System.out.println("Operação inválida.");
            } else {
                if (op == 0) {
                    finalizarMenu();
                } else if (op == 1) {
                    System.out.println(carro.getMarca()+ " " + carro.getModelo()+ " " + ((Carro) carro).getPortas()+ " portas");
                    System.out.println(onibus.getMarca()+ " " + onibus.getModelo());
                    System.out.println(caminhao.getMarca() + " " + onibus.getModelo());
                } else if (op == 2) {
                    if (carro instanceof Carro) {
                        ((Carro) carro).abrirPortas();
                    }
                } else if (op == 3) {
                    if (onibus instanceof Onibus) {
                        ((Onibus) onibus).receberPassageiros();
                    }
                    ;
                } else {
                    if (caminhao instanceof Caminhao) {
                        ((Caminhao) caminhao).carregar();
                    }
                }

            }


        } while (op != 0);
    }
}