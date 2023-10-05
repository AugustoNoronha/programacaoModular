package Models.Colections;

import Models.Classes.Empresa;
import Models.Classes.Estudante;
import Models.Classes.Minicurso;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Minicursos {

    private static Minicursos instancia;
    private List<Minicurso> listaMiniCurso;
    private Minicursos(){
        this.listaMiniCurso = new ArrayList<>();

    }

    public static Minicursos getInstance(){
        if (instancia != null){
            instancia = new Minicursos();
        }
        return instancia;
    }

    public void addMiniCurso(Minicurso minicurso){
        listaMiniCurso.add(minicurso);
    }
    public void delMiniCurso(Minicurso minicurso){
        listaMiniCurso.remove(minicurso);
    }
    public void attMiniCurso(Minicurso minicursoVelho, Minicurso minicursoNovo){
        int index = listaMiniCurso.indexOf(minicursoVelho);
        if(index != -1){
            listaMiniCurso.set(index, minicursoNovo);
        }

    }
    public static void listarMiniCursos(){
        for (Minicurso m : instancia.listaMiniCurso) {
            System.out.println(m);
        }
    }

    public static void menu() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("### Menu MiniCursos ###");
            System.out.println("1. Listar Todos os MiniCursos");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opcao: ");

            int opcao = scanner.nextInt();

            switch (opcao) {

                case 1:
                    listarMiniCursos();
                    break;

                case 0:
                    System.out.println("Saindo do menu de MiniCursos...");
                    return;

                default:
                    System.out.println("Opcao invalida. Tente novamente.");
            }
        }
    }
}
