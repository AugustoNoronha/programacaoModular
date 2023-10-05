package Models.Colections;

import Models.Classes.SessaoTecnica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SessoesTecnicas {

    private static SessoesTecnicas instancia;
    private List<SessaoTecnica> listaSessoesTecnicas;

    private SessoesTecnicas() {
        this.listaSessoesTecnicas = new ArrayList<>();
    }

    public static SessoesTecnicas getInstance() {
        if (instancia == null) {
            instancia = new SessoesTecnicas();
        }
        return instancia;
    }

    public void addSessaoTecnica(SessaoTecnica sessaoTecnica) {
        listaSessoesTecnicas.add(sessaoTecnica);
    }

    public void delSessaoTecnica(SessaoTecnica sessaoTecnica) {
        listaSessoesTecnicas.remove(sessaoTecnica);
    }

    public void attSessaoTecnica(SessaoTecnica sessaoAntiga, SessaoTecnica sessaoNova) {
        int index = listaSessoesTecnicas.indexOf(sessaoAntiga);
        if (index != -1) {
            listaSessoesTecnicas.set(index, sessaoNova);
        }
    }

    public static void listarSessoesTecnicas() {
        for (SessaoTecnica sessaoTecnica : instancia.listaSessoesTecnicas) {
            System.out.println(sessaoTecnica);
        }
    }

    public static void menu() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("### Menu Sessões Técnicas ###");
            System.out.println("1. Listar Todas as Sessões Técnicas");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    listarSessoesTecnicas();
                    break;

                case 0:
                    System.out.println("Saindo do menu de Sessões Técnicas...");
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
