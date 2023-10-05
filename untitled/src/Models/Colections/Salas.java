package Models.Colections;

import Models.Classes.Sala;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Salas {

    private static Salas instancia;
    private List<Sala> listaSalas;

    private Salas() {
        this.listaSalas = new ArrayList<>();
    }

    public static Salas getInstance() {
        if (instancia == null) {
            instancia = new Salas();
        }
        return instancia;
    }

    public void addSala(Sala sala) {
        listaSalas.add(sala);
    }

    public void delSala(Sala sala) {
        listaSalas.remove(sala);
    }

    public void attSala(Sala salaAntiga, Sala salaNova) {
        int index = listaSalas.indexOf(salaAntiga);
        if (index != -1) {
            listaSalas.set(index, salaNova);
        }
    }

    public static void listarSalas() {
        for (Sala sala : instancia.listaSalas) {
            System.out.println(sala);
        }
    }

    public static void menu() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("### Menu Salas ###");
            System.out.println("1. Listar Todas as Salas");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    listarSalas();
                    break;

                case 0:
                    System.out.println("Saindo do menu de Salas...");
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
