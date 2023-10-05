package Models.Colections;

import Models.Classes.Profissional;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Profissionais {

    private static Profissionais instancia;
    private List<Profissional> listaProfissionais;

    private Profissionais() {
        this.listaProfissionais = new ArrayList<>();
    }

    public static Profissionais getInstance() {
        if (instancia == null) {
            instancia = new Profissionais();
        }
        return instancia;
    }

    public void addProfissional(Profissional profissional) {
        listaProfissionais.add(profissional);
    }

    public void delProfissional(Profissional profissional) {
        listaProfissionais.remove(profissional);
    }

    public void attProfissional(Profissional profissionalAntigo, Profissional profissionalNovo) {
        int index = listaProfissionais.indexOf(profissionalAntigo);
        if (index != -1) {
            listaProfissionais.set(index, profissionalNovo);
        }
    }

    public static void listarProfissionais() {
        for (Profissional profissional : instancia.listaProfissionais) {
            System.out.println(profissional);
        }
    }

    public static void menu() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("### Menu Profissionais ###");
            System.out.println("1. Listar Todos os Profissionais");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    listarProfissionais();
                    break;

                case 0:
                    System.out.println("Saindo do menu de Profissionais...");
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
