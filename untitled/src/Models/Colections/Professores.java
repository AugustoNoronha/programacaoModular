package Models.Colections;

import Models.Classes.Professor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Professores {

    private static Professores instancia;
    private List<Professor> listaProfessores;

    private Professores() {
        this.listaProfessores = new ArrayList<>();
    }

    public static Professores getInstance() {
        if (instancia == null) {
            instancia = new Professores();
        }
        return instancia;
    }

    public void addProfessor(Professor professor) {
        listaProfessores.add(professor);
    }

    public void delProfessor(Professor professor) {
        listaProfessores.remove(professor);
    }

    public void attProfessor(Professor professorAntigo, Professor professorNovo) {
        int index = listaProfessores.indexOf(professorAntigo);
        if (index != -1) {
            listaProfessores.set(index, professorNovo);
        }
    }

    public static void listarProfessores() {
        for (Professor professor : instancia.listaProfessores) {
            System.out.println(professor);
        }
    }

    public static void menu() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("### Menu Professores ###");
            System.out.println("1. Listar Todos os Professores");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    listarProfessores();
                    break;

                case 0:
                    System.out.println("Saindo do menu de Professores...");
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
