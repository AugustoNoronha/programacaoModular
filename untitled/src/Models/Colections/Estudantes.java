package Models.Colections;

import Models.Classes.Empresa;
import Models.Classes.Estudante;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Estudantes {
    private static Estudantes instancia;
    private List<Estudante> listaEstudantes;

    private Estudantes(){
        this.listaEstudantes = new ArrayList<>();

    }

    public static Estudantes getIntancia() {
        if (instancia == null) {
            instancia = new Estudantes();
        }
        return instancia;
    }

    public void addEstudante(Estudante estudante){
        listaEstudantes.add(estudante);
    }

    public void delEstudante(Estudante estudante){
        listaEstudantes.remove(estudante);
    }

    public void attEstudante(Estudante estudanteAntigo, Estudante estudanteNovo){
        int index = listaEstudantes.indexOf(estudanteAntigo);
        if (index != -1){
            listaEstudantes.set(index, estudanteNovo);
        }
    }
    public  List<Estudante> listarTodosEstudantes(){
        return listaEstudantes;
    }
    public static void menu() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("### Menu Empresas ###");
            System.out.println("1. Listar Todos as Empresas");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opcao: ");

            int opcao = scanner.nextInt();

            switch (opcao) {

                case 1:
                    // Listar Todas as Empresas
                    List<Empresa> empresas = Empresas.getInstance().listarTodasEmpresas();
                    System.out.println("### Lista de Empresas ###");
                    for (Empresa empresa : empresas) {
                        System.out.println(empresa);
                    }
                    break;

                case 0:
                    System.out.println("Saindo do menu de Empresas...");
                    return;

                default:
                    System.out.println("Opcao invalida. Tente novamente.");
            }
        }
    }

}
