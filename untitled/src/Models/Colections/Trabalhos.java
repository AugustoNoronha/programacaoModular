package Models.Colections;

import Models.Classes.Trabalho;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Trabalhos {

    private static Trabalhos instancia;
    private List<Trabalho> listaTrabalhos;

    private Trabalhos() {
        this.listaTrabalhos = new ArrayList<>();
    }

    public static Trabalhos getInstance() {
        if (instancia == null) {
            instancia = new Trabalhos();
        }
        return instancia;
    }

    public void addTrabalho(Trabalho trabalho) {
        listaTrabalhos.add(trabalho);
    }

    public void delTrabalho(Trabalho trabalho) {
        listaTrabalhos.remove(trabalho);
    }

    public void attTrabalho(Trabalho trabalhoAntigo, Trabalho trabalhoNovo) {
        int index = listaTrabalhos.indexOf(trabalhoAntigo);
        if (index != -1) {
            listaTrabalhos.set(index, trabalhoNovo);
        }
    }

    public static void listarTrabalhos() {
        for (Trabalho trabalho : instancia.listaTrabalhos) {
            System.out.println(trabalho);
        }
    }

    public static void menu() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("### Menu Trabalhos ###");
            System.out.println("1. Listar Todos os Trabalhos");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    listarTrabalhos();
                    break;

                case 0:
                    System.out.println("Saindo do menu de Trabalhos...");
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
