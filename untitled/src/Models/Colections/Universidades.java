package Models.Colections;

import Models.Classes.Universidade;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Universidades {

    private static Universidades instancia;
    private List<Universidade> listaUniversidades;

    private Universidades() {
        this.listaUniversidades = new ArrayList<>();
    }

    public static Universidades getInstance() {
        if (instancia == null) {
            instancia = new Universidades();
        }
        return instancia;
    }

    public void addUniversidade(Universidade universidade) {
        listaUniversidades.add(universidade);
    }

    public void delUniversidade(Universidade universidade) {
        listaUniversidades.remove(universidade);
    }

    public void attUniversidade(Universidade universidadeAntiga, Universidade universidadeNova) {
        int index = listaUniversidades.indexOf(universidadeAntiga);
        if (index != -1) {
            listaUniversidades.set(index, universidadeNova);
        }
    }

    public static void listarUniversidades() {
        for (Universidade universidade : instancia.listaUniversidades) {
            System.out.println(universidade);
        }
    }

    public static void menu() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("### Menu Universidades ###");
            System.out.println("1. Listar Todas as Universidades");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    listarUniversidades();
                    break;

                case 0:
                    System.out.println("Saindo do menu de Universidades...");
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
