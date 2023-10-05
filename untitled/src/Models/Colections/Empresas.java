package Models.Colections;

import Models.Classes.Empresa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Empresas {
    private static Empresas instancia;
    private List<Empresa> listaEmpresas;

    private Empresas() {
        listaEmpresas = new ArrayList<>();
    }

    public static Empresas getInstance() {
        if (instancia == null) {
            instancia = new Empresas();
        }
        return instancia;
    }

    public void addEmpresa(Empresa empresa) {
        listaEmpresas.add(empresa);
    }

    public void delEmpresa(Empresa empresa) {
        listaEmpresas.remove(empresa);
    }

    public void atualizarEmpresa(Empresa empresaAntiga, Empresa empresaNova) {
        int index = listaEmpresas.indexOf(empresaAntiga);
        if (index != -1) {
            listaEmpresas.set(index, empresaNova);
        }
    }

    public List<Empresa> listarTodasEmpresas() {
        return listaEmpresas;
    }

    public void adicionarEmpresa() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("### Adicionar Empresa ###");
        System.out.print("Nome da empresa: ");
        String nome = scanner.nextLine();

        System.out.print("Área de atuação: ");
        String areaAtuacao = scanner.nextLine();

        System.out.print("Local: ");
        String local = scanner.nextLine();

        System.out.print("Interesses: ");
        String interesses = scanner.nextLine();

        Empresa novaEmpresa = new Empresa(nome, areaAtuacao, local);
        novaEmpresa.setInteresses(interesses);
        addEmpresa(novaEmpresa);

        System.out.println("Empresa adicionada com sucesso!");
    }

    public void deletarEmpresa() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("### Deletar Empresa ###");

        // Listar todas as empresas
        List<Empresa> empresas = listarTodasEmpresas();
        System.out.println("Empresas disponíveis para deleção:");
        for (int i = 0; i < empresas.size(); i++) {
            System.out.println(i + ". " + empresas.get(i).getNome());
        }

        // Pedir ao usuário que escolha uma empresa para deletar
        System.out.print("Escolha o número da empresa que deseja deletar: ");
        int indice = scanner.nextInt();

        if (indice >= 0 && indice < empresas.size()) {
            Empresa empresaParaDeletar = empresas.get(indice);
            delEmpresa(empresaParaDeletar);
            System.out.println("Empresa deletada com sucesso!");
        } else {
            System.out.println("Índice inválido. Nenhuma empresa foi deletada.");
        }
    }

    public static void menu() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("### Menu Empresas ###");
            System.out.println("1. Listar Todas as Empresas");
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

